package process;

import java.util.Formatter;
/*import java.util.Timer;
import java.util.TimerTask;*/

public class Program {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("Parametre hatasý. Bu proses uygulamasýdýr, ana program için Grup12.jar'ý çalýþtýrýn.");
			System.exit(0);
		}

		int saniye = Integer.parseInt(args[0]);
		int id = Integer.parseInt(args[1]);
		int oncelik = Integer.parseInt(args[2]);
		int kalanSure = Integer.parseInt(args[3]);
		//Timer timer = new Timer();
		
		/*timer.schedule( new TimerTask() {
		    public void run() {*/
		    	Formatter formatter = new Formatter();
		    	String s = formatter.format("%d.0000 sn", saniye).toString();
		    	formatter.close();
		    	formatter = new Formatter();
		    	String s2 = formatter.format("%-10s proses yürütülüyor", s).toString();
				System.out.format("%-30s(id:%04d  oncelik:%d  kalan süre:%d sn)", s2, id,oncelik,kalanSure);	formatter.close();	System.exit(0); /*}}, 1000);*/
		


	}

}
