package project1;
import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;



import javax.swing.*;

import javax.swing.border.Border;

import javax.swing.border.SoftBevelBorder;

import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")

class count1 extends JFrame implements ActionListener, KeyListener{

  static int sw=1; //화면이 연산후 숫자를 누르면 그갑 초기화 

  boolean co=false; //정수로 계산할것인지 소수로 계산할것인지 확인

  double number, result;

  double memory; //메모리 변수

  

  //텝 정의

 private JTabbedPane jtp = new JTabbedPane();   //JTabbedPane 메서드는 책갈피를 만드는 메서드

 

 //메뉴바 정의
 private JTextField resultBox = new JTextField(" ",33); //계산기 메뉴바 설정
 
 private JTextField memoryState = new JTextField("",5); //메모리상태창 

 

 private MenuBar mb = new MenuBar();

 private Menu file1 = new Menu("Edit");

 private MenuItem fopen = new MenuItem("Save");

 private MenuItem fsave = new MenuItem("Load");

 //private Menu file2 = new Menu("보기");

 private FileDialog fdlg2 = new FileDialog(this, "MyFileOpen", FileDialog.LOAD); //파일 열기

 private FileDialog fdlg1 = new FileDialog(this, "MyFileSave", FileDialog.SAVE); //파일 저장

  

 private Menu file3 = new Menu("Help");

 private MenuItem h = new MenuItem("HelpMenu");  

 private MenuItem in = new MenuItem("info"); //information

  

  

   

 //레이아웃 정의

 private BorderLayout b1 = new BorderLayout(5,5); //전체레이아웃

 private FlowLayout f1 = new FlowLayout();   //텍스트쪽

 private JPanel p1 = new JPanel();

 private GridLayout g1 = new GridLayout(5,1,5,5); //전체레이아웃

 private JPanel p2 = new JPanel();  

 private BorderLayout b2 = new BorderLayout(5,5); //숫자버튼

 private JPanel p3 = new JPanel();     //

 private GridLayout g2 = new GridLayout(1,3,5,5); //backspace, ce, c 버튼 기본틀

 private JPanel p4 = new JPanel();

 private GridLayout g3 = new GridLayout(4,5,5,5); //숫자버튼

 private JPanel p5 = new JPanel();

 private FlowLayout f2 = new FlowLayout();   //backspace, ce, c버튼정렬 

 private JPanel p6 = new JPanel();

 

 //자기소개 패널

 private JPanel p7 = new JPanel();
 

 

 //버튼정의

 private JButton mc = new JButton("MC");

 private JButton mr = new JButton("MR");

 private JButton ms = new JButton("MS");

 private JButton mplus = new JButton("M+");

 //

 private JButton back = new JButton("BackSpace");

 private JButton ce = new JButton("CE");

 private JButton c = new JButton("C");

 //

 private JButton num0 = new JButton("0");

 private JButton num1 = new JButton("1");

 private JButton num2 = new JButton("2");

 private JButton num3 = new JButton("3");

 private JButton num4 = new JButton("4");

 private JButton num5 = new JButton("5");

 private JButton num6 = new JButton("6");

 private JButton num7 = new JButton("7");

 private JButton num8 = new JButton("8");

 private JButton num9 = new JButton("9");

 private JButton equal = new JButton("=");

 private JButton plus = new JButton("+");

 private JButton divide = new JButton("/");

 private JButton sqrt = new JButton("sqrt");

 private JButton multi = new JButton("*"); //multiplication

 private JButton sub = new JButton("-"); //subtraction 

 

 private JButton mod = new JButton("%");

 private JButton x = new JButton("1/x");

 private JButton jum = new JButton(".");

 private JButton banjeon = new JButton("+/-");

 

 

 

 //자기소개 쪽 버튼 및 패널==

 ImageIcon my = new ImageIcon("./img/my.jpg");

 private JButton myself = new JButton(my);

 private JLabel my1 = new JLabel("name ?");

 private JLabel my2 = new JLabel("");

 private JLabel my3 = new JLabel("저의 취미는 ?");

 private JLabel my4 = new JLabel("");

 private JLabel my5 = new JLabel("저의 혈액형은 ?");

 private JComboBox cb = new JComboBox();        //혈액형 콤보박스

 private JTextArea textArea = new JTextArea("talk\n"); //자기소개 텍스트에어리어

 private JButton btn=new JButton("C");        //초기화버튼

 //private JPanel scroll = new JPanel();

 //private JScrollPane simpleScroll = new JScrollPane(textArea,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

 private JPasswordField add1 = new JPasswordField();

 private JTextField add = new JTextField();

 

 

 String pre = ""; //JTextField 의 문자열을 담을 변수

 String operand = ""; //이벤트발생시 숫자를 담을 변수

 String operator = ""; //이벤트발생시 연산자를 담을 변수

 

  

 //색상 정의

 Color c1= new Color(255,0,0); //빨강

 Color c2= new Color(0,0,255); //파랑

 

 public count1(){

  

  this.init();

  this.start();

   

    

  //화면 사이즈 조정

  super.setSize(410, 340);

  

  //화면위치 가운데로 올리기

  Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

  Dimension frm = super.getSize();

  int xpos = (int)(screen.getWidth() / 2 - frm.getWidth() / 2);

  int ypos = (int)(screen.getHeight() / 2 - frm.getHeight() / 2);

  super.setLocation(xpos, ypos);

  

  //화면크기 조정불가

  super.setResizable(false);

  super.setVisible(true);

  super.setTitle("Calculate Title");

  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    

 }

 

 public void init(){  //화면설정

    

  Container con = getContentPane();

  JPanel ct = new JPanel();

  JPanel ct1 = new JPanel();

   

  

  

  //메뉴바 구성////////////////////////

  file1.add(fopen);

  file1.addSeparator();

  file1.add(fsave);

  mb.add(file1); //mb.add(file2); 

  file3.add(in);

  file3.addSeparator();

  file3.add(h);

  mb.add(file3); //메뉴바 

  this.setMenuBar(mb);

    

  //화면구성 

  ct.setLayout(b1); 

    

  p1.setBorder(new TitledBorder("실행결과창"));

  p1.setLayout(f1);

  p1.add(resultBox);

  resultBox.setHorizontalAlignment(JTextField.RIGHT); //화면 오른쪽 정렬

  resultBox.setEditable(false);  //텍스트필드 조작금지

    

  ct.add("North",p1);

    

  p2.setBorder(new TitledBorder("메모리"));

  p2.setLayout(g1);

    

  SoftBevelBorder A = new SoftBevelBorder(SoftBevelBorder.LOWERED); 

  //버튼 안으로 들어가게함

  p2.add(memoryState);

  memoryState.setBorder(A);

  memoryState.setEditable(false);  //텍스트필드 조작금지

  p2.add(mc);

  mc.setForeground(c1);

  p2.add(mr);

  mr.setForeground(c1);

  p2.add(ms);

  ms.setForeground(c1);

  p2.add(mplus);

  mplus.setForeground(c1);

  ct.add("West",p2);

        

  p3.setBorder(new TitledBorder("숫자 및 연산자"));

  p3.setLayout(b2);

         

  //p4.setBorder(new TitledBorder(""));

  p4.setLayout(g2);

  p4.add(back);

  back.setForeground(c1);

  p4.add(ce);

  ce.setForeground(c1);

  p4.add(c);

  c.setForeground(c1);

  p3.add("North",p4);

    

  //p5.setBorder(new TitledBorder(""));

  p5.setLayout(g3);

        

  p5.add(num7);

  num7.setForeground(c2);

  p5.add(num8);

  num8.setForeground(c2);

  p5.add(num9);

  num9.setForeground(c2);

  p5.add(divide);

  divide.setForeground(c1);

  p5.add(sqrt);

  sqrt.setForeground(c2);

  p5.add(num4);

  num4.setForeground(c2);

  p5.add(num5);

  num5.setForeground(c2);

  p5.add(num6);

  num6.setForeground(c2);

  p5.add(multi); 

  multi.setForeground(c1);

  p5.add(mod);

  p5.add(num1);

  num1.setForeground(c2);

  p5.add(num2);

  num2.setForeground(c2);

  p5.add(num3);

  num3.setForeground(c2);

  p5.add(sub);

  sub.setForeground(c1);

  p5.add(x);

  p5.add(num0);

  num0.setForeground(c2);

  p5.add(banjeon);

  p5.add(jum);

  p5.add(plus);

  plus.setForeground(c1);

  p5.add(equal);

  equal.setForeground(c1);     

    

  p6.setLayout(f2);

  p6.add(p5);

  p3.add("Center",p6);

  ct.add(p3);

  

  p1.setBackground(new Color(226,165,165));

  p2.setBackground(new Color(222,166,124));

  p3.setBackground(new Color(222,166,124));

  p4.setBackground(new Color(222,166,124));

  //p5.setBackground(new Color(222,166,124));

  

    

  //-----------------------자기소개 부분--------------------

  ct1.setLayout(null);

  ct1.setBackground(new Color(133,216,243));  //자기소개 배경색

  myself.setBounds(10, 30, 160, 220);  //가로, 세로, 가로크기,세로크기

  ct1.add(myself);

  my1.setBounds(180, 35, 100, 20);

  ct1.add(my1);

  my2.setBounds(270, 35, 100, 20);

  ct1.add(my2);

  my3.setBounds(180, 60, 100, 20);

  ct1.add(my3);

  my4.setBounds(270, 60, 150, 20);

  ct1.add(my4);

  my5.setBounds(180, 90, 150, 20);

  ct1.add(my5);

  cb.setBounds(280, 90, 100, 20);

  ct1.add(cb);

  cb.addItem("AB");

  cb.addItem("A");

  cb.addItem("B");

  cb.addItem("O");

  textArea.append("");

  //textArea.setCaretPosition(textArea.getText().length());

  textArea.setLineWrap(true);   //행 넘기기 기능 

  textArea.setWrapStyleWord(true); //행 넘길 때 행의 마지막 단어가 두행에 걸쳐 나뉘지 않도록 하기

  textArea.setEditable(true);   //편집 가능

  Border lineBorder = BorderFactory.createLineBorder(Color.blue,3);  //TextArea의 테두리선의 색을 검정 두깨를 3px로 설정

  Border lineBorder1 = BorderFactory.createLineBorder(Color.red,3);

  

  Border emptyBorder = BorderFactory.createEmptyBorder(7,7,7,7);

  //TextArea에 lineBorder(파란테두리), emptyBorder(여백)로 구성된 복합경계선을 설정합니다.

  

  ct1.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));

  textArea.setBorder(BorderFactory.createCompoundBorder(lineBorder1, emptyBorder));

  //TextArea에 스크롤 기능을 추가한 후 Panel안에 집어 넣습니다.

  

  textArea.setBounds(180, 120, 150, 90);

  ct1.add(textArea);

  //세로스크롤은 기본적으로 나오게, 가로스크롤은 안나오게

  

  btn.setBounds(340, 120, 50, 40);

  ct1.add(btn);

  

  add.setBounds(180, 220, 75, 20);

  ct1.add(add);

  

  add1.setBounds(270, 220, 75, 20);

  ct1.add(add1);

 

  

  

  //----------------텝에 ct1과 ct 추가 -------------------------

  //ct1.setBackground(Color.red);

  jtp.addTab("자기소개",ct1);

  jtp.addTab("계산기",ct);

    

  con.add(jtp); //컨터이너에 올림

  

 }

 

 public void start(){

  

  num0.addActionListener(this);

  num1.addActionListener(this);

  num2.addActionListener(this);

  num3.addActionListener(this);

  num4.addActionListener(this);

  num5.addActionListener(this);

  num6.addActionListener(this);

  num7.addActionListener(this);

  num8.addActionListener(this);

  num9.addActionListener(this);

  

  equal.addActionListener(this);

  plus.addActionListener(this);

  divide.addActionListener(this);

  sqrt.addActionListener(this);

  multi.addActionListener(this);

  sub.addActionListener(this);

  memoryState.addActionListener(this);

  

  mc.addActionListener(this);

  mr.addActionListener(this);

  ms.addActionListener(this);

  mplus.addActionListener(this);

  back.addActionListener(this);

  c.addActionListener(this);

  ce.addActionListener(this);

  

  banjeon.addActionListener(this);

  jum.addActionListener(this);

  x.addActionListener(this);

  mod.addActionListener(this);

  

  //////////////////////자기소개 액션리스너 추가

  myself.addActionListener(this);

  

  fopen.addActionListener(this);

  fsave.addActionListener(this);

  btn.addActionListener(this);

  

  //텍스트 필드에 키보드리스너 추가

  add.addKeyListener(this);

  add1.addKeyListener(this);

 }

 

 public void tab(){

  

 }

 



 public void keyPressed(KeyEvent e) {

  

  if(e.getKeyCode()==KeyEvent.VK_ENTER){

   //add에 textArea의 내용을 더하고 줄바꿈을 합니다.

      textArea.append(add.getText()+"\n");

   //add초기화

      add.setText("");

  }

  else if(e.getKeyCode() == KeyEvent.VK_HOME){

    textArea.append(add1.getText()+"\n");

    //add초기화

    add1.setText("");

  }



 }

 

 public void keyReleased(KeyEvent e) {}

 public void keyTyped(KeyEvent e) {}

 

 public void actionPerformed(ActionEvent e) {

 

  //---------자기소개 이벤트----------

  

  if(e.getSource() == myself){

   my2.setText("hello?");

   my2.setForeground(c2);

   my4.setText("hobby");

   my4.setForeground(c2);

  } 

  if(e.getSource() == btn){

   textArea.setText("");

   textArea.append("talk\n");

  }

 /* if(e.getSource() == btn1){

   

   textArea.append(.getActionCommand()+"\n");

   add.setText("");

  }*/

    

  //---------계산기 이벤트---------

  

  if(e.getSource() == fopen) {

   fdlg1.setVisible(true);

  }

  else if(e.getSource() == fsave) {

   fdlg2.setVisible(true);

  }

  

  String s = e.getActionCommand();

  

  

  pre = resultBox.getText(); //화명창에 떠있는것들

  

  if (s == "0" || s == "1" || s == "2" || s == "3" || s =="4" ||s == "5" || 

    s == "6" || s == "7" || s =="8" || s == "9") 

  {

   if(sw==1)

   {

   //숫자 처리부분 

    resultBox.setText(pre+s);

   }

   else if(sw==0)

   { pre="";

    resultBox.setText(pre+s);

    sw=1;

   }

  }

  if(s==".")

  {

   resultBox.setText(pre+s);

   co=true;

   

  }

  if (s == "+" || s == "-" || s == "*" || s == "/") { // 연산자 처리부분

   operand = pre;  //연산자  화면에 뜨는값

   operator = s;  //숫자 누른값

   resultBox.setText("");

   

  }

  if (s == "C") {

   resultBox.setText("");

   co=false;

   number=0;

   result=0;

  }

  if (s == "CE") {

   resultBox.setText("");

   co=false;

  }

  if (s =="BackSpace") {

   String temp = resultBox.getText();

   temp = temp.substring(0, temp.length()-1);

   resultBox.setText(temp);

  }

  

  if (s == "%") {

   result = Double.parseDouble(operand) * Double.parseDouble(pre) / 100.0;

   resultBox.setText(""+result); 

  }

  if (s == "sqrt") {

   result = Math.sqrt(Double.parseDouble(pre));

   resultBox.setText(""+result);

  }

  if (s == "1/x") {

   result = 1 / (Double.parseDouble(pre));

   resultBox.setText(""+result);

  }

  if (s == "+/-") {

   result = -1 * (Double.parseDouble(pre));

   resultBox.setText(""+result);

  }

  if (s == "MC"){

   memory = 0;

   memoryState.setText("");

   

  }

  if (s == "MS"){

   memory = Double.parseDouble(resultBox.getText());

   memoryState.setText("M");

   memoryState.setHorizontalAlignment(JTextField.CENTER); //M을 가운데로 뜨게함

  }

  if( s == "MR"){

   resultBox.setText(String.valueOf(memory));

   String resultText = resultBox.getText();

   if((resultText.length()-2)==resultText.indexOf(".")){

    if(resultText.charAt(resultText.length()-1)=='0')

    {

     resultBox.setText(resultText.substring(0, resultText.length()-2));

    }

   }

  }

  if( s == "M+"){

   memory+= Double.parseDouble(resultBox.getText());

   memoryState.setText("M");

  }

  

  ///////////////////////////////////////////

  if(co==true){

   if (s == "=") { 

    sw=0;    //=을 실행시켰을때 연산결과를 하나하나씩 넣어줌

    char c = operator.charAt(0);

    System.out.println(c);

    switch (c) {

    case '+':

     result = Double.parseDouble(operand) + Double.parseDouble(pre);

     resultBox.setText(""+result);

     break;

    case '-':

     result = Double.parseDouble(operand) - Double.parseDouble(pre);

     resultBox.setText(""+result);

     break;

    case '*':

     result = Double.parseDouble(operand) * Double.parseDouble(pre);

     resultBox.setText(""+result);

     break;

    case '/':

     result = Double.parseDouble(operand) / Double.parseDouble(pre);

     resultBox.setText(""+result);

     break;

    }

   }

  }

  

  ////////////////////////////////////

  else if(co==false){

   if (s == "=") { 

    sw=0;    //=을 실행시켰을때 연산결과를 하나하나씩 넣어줌

    char c = operator.charAt(0);

    System.out.println(c);

    switch (c) {

    case '+':

     result = Double.parseDouble(operand) + Double.parseDouble(pre);

     resultBox.setText(""+(int)result);

     break;

    case '-':

     result = Double.parseDouble(operand) - Double.parseDouble(pre);

     resultBox.setText(""+(int)result);

     break;

    case '*':

     result = Double.parseDouble(operand) * Double.parseDouble(pre);

     resultBox.setText(""+(int)result);

     break;

    case '/':

     result = Double.parseDouble(operand) / Double.parseDouble(pre);

     resultBox.setText(""+(int)result);

     break;

    }

   }

  }

 }

 

 

}

public class clcl {

 public static void main(String[] args){

            

  new count1();

 }

}
