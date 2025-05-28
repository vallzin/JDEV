package cursojava.thread;

import javax.swing.SwingUtilities;

public class ExecutarTela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TelaTimeThread telaTimeThread = new TelaTimeThread();*/
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaTimeThread();
            }
        });

	}

}
