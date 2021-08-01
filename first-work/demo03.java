package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo03 extends  JFrame implements ActionListener{

    public static final int FRAME_W=400;
    public static final int FRAME_H=400;
    public static final int SCREEN_W=Toolkit.getDefaultToolkit().getScreenSize().width; //得到屏幕宽度
    public static final int SCREEN_H=Toolkit.getDefaultToolkit().getScreenSize().height; //得到屏幕高度
    public int frame_x=(SCREEN_W-FRAME_W)/2;//得到x方向计算器框的位置
    public int frame_y=(SCREEN_H-FRAME_H)/2;//得到y方向计算器框的位置

    private  JPanel jp_north=new JPanel();
    private JTextField input_text=new JTextField();//输入框
    private JButton C=new JButton("C");
    private  JPanel jp_center=new JPanel();


    public demo03() throws HeadlessException {
        this.init(); //调用初始化窗体init的方法
        this.add_north();//调用北面控件输入框add_north的方法
        this.add_button();//调用中央控件add_button方法
    }

    public void init(){
        this.setTitle("VV的计算器");
        this.setSize(350,350); //窗口大小
        this.setLayout(new BorderLayout()); //设置布局
        this.setResizable(false); //固定窗口的大小
        this.setLocation(frame_x,frame_y); //窗体的位置
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //关闭窗口的时候退出程序
    }

    public void add_north(){
        this.input_text.setPreferredSize(new Dimension(250,40)); //设置输入框最好的大小(流式布局)
        jp_north.add(input_text); //添加控件
        jp_north.add(C);
        C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_text.setText("0");
            }
        });
        this.add(jp_north,BorderLayout.NORTH); //将窗体添加到北面布局
    }
    
    public void add_button(){
        final char[] button = {'7','8','9','+','4','5','6','-','1','2','3','*','0','.','=','/'};
        final String button_text = new String(button);

        this.jp_center.setLayout(new GridLayout(4,4));
        for(int i=0;i<16;i++){
            String temp=button_text.substring(i,i+1);
            String regex="[\\+\\-*/.=]";
            JButton center_button=new JButton();
            center_button.setText(temp); //给按钮添加文字
            if(temp.matches(regex)){
                center_button.setFont(new Font("",Font.LAYOUT_RIGHT_TO_LEFT,16)); //设置字体风格字号
                center_button.setForeground(Color.blue);
            }else
                center_button.setFont(new Font("",Font.LAYOUT_RIGHT_TO_LEFT,16));
            center_button.addActionListener(this);
            jp_center.add(center_button);
        }

        this.add(jp_center,BorderLayout.CENTER);//将窗体添加到中央控件
    }

    public static void main(String[] args) {
        demo03 carculator =new demo03();
        carculator.setVisible(true); //用来显示/隐藏GUI组件(窗口，布局，面板，按钮，监听器)的
    }

    private String first_input=null;
    private String operator=null;
    @Override
    public void actionPerformed(ActionEvent e) {
        String clickStr=e.getActionCommand(); //按钮所示为一个字符串
        if(".0123456789".indexOf(clickStr)!=-1){  //出现的是符号，-1为不出现
            this.input_text.setText(input_text.getText()+clickStr);
            this.input_text.setHorizontalAlignment(JTextField.RIGHT); //属性文本靠右对齐
            //JOptionPane.showMessageDialog(this,clickStr);//显示点击按钮上的值，弹出信息
        }else if(clickStr.matches("[\\+\\-*/]{1}")){ //检测是否匹配给定的正则表达式，是就是1
            operator=clickStr;
            first_input=this.input_text.getText(); //记录之前输入的值
            this.input_text.setText(""); //清空，记录该值并继续输入下一个值
        }else if(clickStr.equals("=")){
            Double a=Double.valueOf(first_input);
            Double b=Double.valueOf(this.input_text.getText()); //运算符后面显示到文本框的数字
            Double result = null;
            switch(operator){
                case "+":
                    result=a+b;
                    break;
                case "-":
                    result=a-b;
                    break;
                case "*":
                    result=a*b;
                    break;
                case "/":
                    if(b!=0)
                        result=a/b;
                    else
                    {
                        System.out.println("输入不合法！");
                        break;
                    }
            }
            this.input_text.setText(result.toString());
        }

    }
}