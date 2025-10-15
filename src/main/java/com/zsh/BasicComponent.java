package com.zsh;

import java.awt.*;

public class BasicComponent extends Component {
    public static final Font SONG=new Font("宋体",Font.PLAIN,15);
    public static final Font CONSOLAS=new Font("Consolas",Font.ITALIC,15);
    public static final Font TIMES_NEW_ROMAN=new Font("Times New Roman",Font.BOLD,18);

    public void layoutComponents(Frame frame){

        Label newLabel=layoutLabel();
        Button newButton=layoutButton();

        frame.add(newLabel);
        frame.add(newButton);
    }

    private Label layoutLabel(){
        Label label=new Label("Arthur Morgan");
        label.setSize(120,50);
        label.setLocation(15,30);
        label.setFont(CONSOLAS);
        label.setForeground(Color.RED);// 设置字体颜色

        return label;
    }

    private Button layoutButton(){
        Button button=new Button("Click to recharge");
        button.setSize(200,50);
        button.setLocation(15,80);
        button.setFont(TIMES_NEW_ROMAN);
        button.addActionListener(e->{
            System.out.println("充值成功！");
        });

        return button;
    }
}
