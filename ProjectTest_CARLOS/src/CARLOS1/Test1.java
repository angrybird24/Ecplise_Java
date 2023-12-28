package CARLOS1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Test1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static String FilePath ="..\\ProjectTest_CARLOS\\images\\";

	//WC_전용 =========================
	public static int CK_WordCng = 0;
	private JTextArea WC_L_TF_1;
	private JTextArea WC_L_TF_2;
	private JTextField WC_L_TF_3;
	private JTextField WC_L_TF_4;
	private JScrollPane WC_L_SP_1;
	private JScrollPane WC_L_SP_2;
	private JLabel WC_L_INFO_1;
	private JLabel WC_L_INFO_2;
	private JLabel WC_L_INFO_3;
	private JButton WC_B_1_CHG_ALL; 
	private JButton WC_B_2_RESET;
	private JLabel WC_L_INFO_RED;
	private JLabel WC_L_BEFORE;
	private JLabel WC_L_AFTER;
	private JPanel panel_1;
	//================================
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test1 frame = new Test1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Test1() {
		
		/////////
		//MAIN 
		/////////
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 720, 1280); //갤럭시 S2, HD갤럭시 S3 ,갤럭시 노트2 사이즈
		setBounds(0, 0, 1400, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel Mainpanel = new JPanel();
		Mainpanel.setBounds(1026, 69, 214, 70);
		contentPane.add(Mainpanel);
		Mainpanel.setLayout(null);
		
				JButton m_WordCngBtn = new JButton("글자 변경");
				m_WordCngBtn.setBounds(0, 0, 214, 70);
				Mainpanel.add(m_WordCngBtn);
				m_WordCngBtn.setFont(new Font("맑은 고딕", Font.BOLD, 20));
				
						
						//////////////
						//<WC Event> 
						//////////////
						m_WordCngBtn.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								m_WordCngBtn.setText("글자 변경 선택됨");
								CK_WordCng += 1;
								if (CK_WordCng > 1) {
									CK_WordCng = 0;
									m_WordCngBtn.setText("글자 변경");
									panel_1.setVisible(true);
								} 
								if (CK_WordCng == 1) { 
									panel_1.setVisible(false); 
								}
							}
						});

		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(255, 0, 0), 3, true));
		panel_1.setBounds(140, 500, 1100, 400);
		contentPane.add(panel_1);


		WC_B_1_CHG_ALL = new JButton("변경\n실행");
		WC_B_1_CHG_ALL.setBounds(938, 32, 150, 343);
		WC_B_1_CHG_ALL.setFont(new Font("한컴 고딕", Font.PLAIN, 30));

		WC_L_TF_1 = new JTextArea();
		WC_L_TF_1.setBounds(1, 1, 501, 143);
		panel_1.add(WC_L_TF_1);

		WC_L_TF_2 = new JTextArea();
		WC_L_TF_2.setColumns(10);
		WC_L_TF_2.setBounds(20, 245, 503, 145); 

		WC_L_SP_1 = new JScrollPane(WC_L_TF_1);
		WC_L_SP_1.setBounds(20, 50, 503, 145);

		WC_L_SP_2 = new JScrollPane(WC_L_TF_2);
		WC_L_SP_2.setBounds(20, 245, 503, 145);

		WC_L_INFO_1 = new JLabel("문자열 전체 입력창");
		WC_L_INFO_1.setBounds(10, 10, 250, 30);
		WC_L_INFO_1.setFont(new Font("한컴 고딕", Font.BOLD, 15));
		
		WC_L_INFO_2 = new JLabel("결과 창");
		WC_L_INFO_2.setBounds(10, 210, 250, 30);
		WC_L_INFO_2.setFont(new Font("한컴 고딕", Font.BOLD, 15));
		
		WC_L_INFO_3 = new JLabel("변경할 문자 입력");
		WC_L_INFO_3.setBounds(550, 32, 171, 15);
		WC_L_INFO_3.setFont(new Font("한컴 고딕", Font.BOLD, 15));
		
		WC_L_TF_3 = new JTextField();
		WC_L_TF_3.setBounds(543, 59, 221, 32);
		WC_L_TF_3.setColumns(10);

		WC_L_TF_4 = new JTextField();
		WC_L_TF_4.setBounds(543, 141, 221, 32);
		WC_L_TF_4.setColumns(10);
		
		JLabel WC_L_INFO_4 = new JLabel("변경되려는 문자열");
		WC_L_INFO_4.setBounds(550, 114, 171, 15);
		WC_L_INFO_4.setFont(new Font("한컴 고딕", Font.BOLD, 15));
		
		WC_L_INFO_RED = new JLabel("입력 할 문자열을 넣고 변경실행을 클릭하세요. ");
		WC_L_INFO_RED.setForeground(new Color(255, 0, 0));
		WC_L_INFO_RED.setFont(new Font("HY헤드라인M", Font.PLAIN, 15));
		WC_L_INFO_RED.setBounds(550, 200, 350, 30);
		
		WC_L_BEFORE = new JLabel("변경전 길이 : ");
		WC_L_BEFORE.setFont(new Font("굴림", Font.BOLD, 15));
		WC_L_BEFORE.setBounds(550, 245, 350, 20);
		
		WC_L_AFTER = new JLabel("변경후 길이 : ");
		WC_L_AFTER.setFont(new Font("굴림", Font.BOLD, 15));
		WC_L_AFTER.setBounds(550, 275, 350, 20);
		
		WC_B_2_RESET = new JButton("초기화");
		WC_B_2_RESET.setFont(new Font("한컴 고딕", Font.PLAIN, 30));
		WC_B_2_RESET.setBounds(777, 32, 150, 150);

		
		

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(140, 75, 615, 415);
		lblNewLabel_3.setIcon(new ImageIcon(FilePath+"vogue1.jpg"));  
		contentPane.add(lblNewLabel_3);
		
		
		 
		
		
		
		panel_1.add(WC_L_SP_1);
		panel_1.add(WC_L_SP_2);
		panel_1.add(WC_L_TF_3);
		panel_1.add(WC_L_TF_4);
		panel_1.add(WC_L_INFO_1);
		panel_1.add(WC_L_INFO_2);
		panel_1.add(WC_L_INFO_3);
		panel_1.add(WC_L_INFO_4);
		panel_1.add(WC_L_INFO_RED);
		panel_1.add(WC_L_BEFORE);
		panel_1.add(WC_L_AFTER);
		panel_1.add(WC_B_1_CHG_ALL);
		panel_1.add(WC_B_2_RESET);
		panel_1.setLayout(null);
		
		///////////
		//메인버튼2
		////////////
		JButton m_WordCngBtn_1 = new JButton("글자 변경2");
		m_WordCngBtn_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		m_WordCngBtn_1.setBounds(788, 69, 214, 70);
		contentPane.add(m_WordCngBtn_1);
		panel_1.setVisible(true);
		setLocationRelativeTo(null);

		
		
		
		
		 
		
		
		
		
		
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] happy ={"해삐","해피","해삐","해피"}; 
				int choice = JOptionPane.showOptionDialog(null,"행복하시나요?","알유해피?",0,0,null,happy,happy[3]);
			}
		});
		
		
		WC_B_2_RESET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WC_L_TF_1.setText("");
				WC_L_TF_2.setText("");
				WC_L_TF_3.setText("");
				WC_L_TF_4.setText("");
				WC_L_INFO_RED.setText("입력 할 문자열을 넣고 변경실행을 클릭하세요. ");
				WC_L_BEFORE.setText("변경전 길이 : ");
				WC_L_AFTER.setText("변경후 길이 : ");
			}
		});
		
		WC_B_1_CHG_ALL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input_Text = WC_L_TF_1.getText();   
				input_Text = input_Text.replaceAll(WC_L_TF_3.getText() ,WC_L_TF_4.getText());
				WC_L_TF_2.setText(input_Text);
				WC_L_BEFORE.setText("변경전 길이 : "+ WC_L_TF_1.getText().length() + " 자 ");
				WC_L_AFTER.setText("변경후 길이 : "+ WC_L_TF_2.getText().length() + " 자 ");
				WC_L_INFO_RED.setText("변경되었습니다 ..!! ");
			}
		});

	}
}
