package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {	
		
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();
		

		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 0; i < 10; i++) {
				System.out.println("thread de envio de e-mail");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 0; i < 10; i++) {
				System.out.println("thread de envio de nota fiscal");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
}
