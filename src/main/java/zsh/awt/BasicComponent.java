package zsh.awt;

import java.awt.*;

public class BasicComponent extends Component {
    public static final Font CONSOLAS=new Font("Consolas",Font.ITALIC,15);
    public static final Font TIMES_NEW_ROMAN =new Font("Times New Roman",Font.PLAIN,15);
    public static final Font TIMES_NEW_ROMAN_SMALLER =new Font("Times New Roman",Font.BOLD,12);

    public static final Color SKYBLUE=new Color(0,191,255);
    public static final Color LIGHTYELLOW=new Color(0xFFF8E7);

    public void layoutComponents(Frame frame){

        Label newLabel=layoutLabel();
        TextField username=layoutTextField();
        TextField password=layoutPasswordField();
        Checkbox rememberPasswordCheckbox=layoutCheckbox("Remember password",15,175,Color.GREEN);
        layoutCheckboxGroup(frame);
        TextArea newTextArea=layoutTextArea();
        Button newButton=layoutButton(username,password,rememberPasswordCheckbox);

        frame.add(newLabel);
        frame.add(username);
        frame.add(password);
        frame.add(rememberPasswordCheckbox);
        frame.add(newTextArea);
        frame.add(newButton);

    }

    // 标签
    private Label layoutLabel(){
        Label label=new Label("Arthur Morgan");
        label.setBounds(15,30,120,50);// 一键设置x y 宽度 高度
        label.setFont(CONSOLAS);
        label.setForeground(Color.RED);// 设置字体颜色

        return label;
    }

    // 文本框
    private TextField layoutTextField(){
        TextField textField=new TextField();
        textField.setBounds(15,80,200,30);
        textField.setFont(TIMES_NEW_ROMAN);

        return textField;
    }

    // 密码文本框
    private TextField layoutPasswordField(){
        TextField passwordField=new TextField();
        passwordField.setBounds(15,115,200,30);
        passwordField.setFont(TIMES_NEW_ROMAN);
        passwordField.setEchoChar('*');// 用户输入的字符都会被*替代

        return passwordField;
    }

    // 勾选框
    private Checkbox layoutCheckbox(String content,int locationX,int locationY,Color fontColor){
        Checkbox checkbox=new Checkbox(content);
        checkbox.setBounds(locationX,locationY,150,20);
        checkbox.setFont(TIMES_NEW_ROMAN_SMALLER);
        checkbox.setForeground(fontColor);

        return checkbox;
    }

    // 文本区域（支持回车换行）
    private TextArea layoutTextArea(){
        TextArea textArea=new TextArea();
        textArea.setBounds(225,50,200,100);
        textArea.setFont(TIMES_NEW_ROMAN);
        textArea.setBackground(LIGHTYELLOW);

        return textArea;
    }

    // 按钮
    private Button layoutButton(TextField textField,TextField passwordField,Checkbox checkbox){
        Button button=new Button("Login");
        button.setBounds(15,150,200,20);
        button.setFont(TIMES_NEW_ROMAN_SMALLER);
        button.setBackground(SKYBLUE);// 天蓝色
        button.addActionListener(e->{
            String username=textField.getText();
            String password=passwordField.getText();
            System.out.println("username: "+username);
            System.out.println("password: "+password);

            if(checkbox.getState()){
                System.out.println("用户勾选了记住密码");
            }
        });

        return button;
    }

    // 勾选框组（单选）
    private void layoutCheckboxGroup(Frame frame){
        CheckboxGroup group=new CheckboxGroup();

        Checkbox c1=layoutCheckbox("choose me!",15,180,Color.BLACK);
        frame.add(c1);
        c1.setCheckboxGroup(group);

        Checkbox c2=layoutCheckbox("don't choose him",15,205,Color.BLACK);
        frame.add(c2);
        c2.setCheckboxGroup(group);

    }
}
