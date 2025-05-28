package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TelaTimeThread extends JDialog{
	
	private JPanel jPanel = new JPanel(new GridBagLayout());//painel de componentes
	
	private JLabel descricaoHora1 = new JLabel("Time da Thread 1");
	private JTextField mostraTempo1 = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time da Thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton1 = new JButton("start");
	private JButton jButton2 = new JButton("stop");
	
	//private volatile boolean executando = false;
	private volatile boolean thread1Running = false;
	
	/*private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			executando = true;
			
			while(executando) {
				mostraTempo1.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
						format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					executando = false;
				}
			}
			
		}
	};
	*/
	
	private Thread thread1Time;
	private Thread thread2Time;
	
	public TelaTimeThread() {
		//configurações iniciais
		setTitle("Minha tela thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		//fim configurações iniciais
		
		/*Gerenciador de layout*/
		GridBagConstraints gridBagConstraints = new GridBagConstraints();//controlardo de posicionamento
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		descricaoHora1.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora1, gridBagConstraints);
		
		gridBagConstraints.gridy++;
		mostraTempo1.setPreferredSize(new Dimension(200, 25));
		mostraTempo1.setEditable(false);
		jPanel.add(mostraTempo1, gridBagConstraints);
		
		gridBagConstraints.gridy++;
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		gridBagConstraints.gridy++;
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2,gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.gridy++;
		jButton1.setPreferredSize(new Dimension(92, 25));
		jPanel.add(jButton1, gridBagConstraints);
		
		gridBagConstraints.gridx++;
		jButton2.setPreferredSize(new Dimension(92, 25));
		jPanel.add(jButton2, gridBagConstraints);
		/*
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {//executa o click do botão

				thread1Time = new Thread(thread1);
				thread1Time.start();
				
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				thread1Time.stop();
				
			}
		});
		*/
		jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (thread1Time == null || !thread1Time.isAlive()) {
                    thread1Running = true;
                    thread1Time = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            while (thread1Running) {
                                final String time = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss")
                                        .format(Calendar.getInstance().getTime());
                                SwingUtilities.invokeLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        mostraTempo1.setText(time);
                                    }
                                });
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException ex) {
                                    Thread.currentThread().interrupt();
                                    break;
                                }
                            }
                        }
                    });
                    thread1Time.start();
                    jButton1.setEnabled(false);
                    jButton2.setEnabled(true);
                }
            }
        });
		
		jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (thread2Time == null || !thread2Time.isAlive()) {
                    thread1Running = true;
                    thread2Time = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            while (thread1Running) {
                                final String time = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
                                        .format(Calendar.getInstance().getTime());
                                SwingUtilities.invokeLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        mostraTempo2.setText(time);
                                    }
                                });
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException ex) {
                                    Thread.currentThread().interrupt();
                                    break;
                                }
                            }
                        }
                    });
                    thread2Time.start();
                }
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread1Running = false;
                if (thread1Time != null && thread2Time != null) {
                    thread1Time.interrupt();
                    thread2Time.interrupt();
                }
                jButton1.setEnabled(true);
                jButton2.setEnabled(false);
            }
        });
		
		jButton2.setEnabled(false);
		add(jPanel, BorderLayout.WEST);
		/*sempre o ultimo comando*/
		setVisible(true);//torna a tela visível para o usuário
	}

}
