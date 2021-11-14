
class PC{
	
	public int memorija = 0;
	public String tipNaMemorija;
	public int hardDisk = 0;
	public String golemina;
	public String ssd;
	public String disk;
	
	public PC(int memorija, String tipNaMemorija, int hardDisk, String ssd, String disk, String golemina) {
		this.memorija = memorija;
		this.tipNaMemorija = tipNaMemorija;
		this.hardDisk = hardDisk;
		this.golemina = golemina;
		this.ssd = ssd;
		this.disk = disk;
	}
	
	public void Zgolemi(int zgolemiMemorija , int novSSDDisk) {
		
		int sega = this.memorija+zgolemiMemorija;
		
		System.out.println("Memorijata bese " + this.memorija + this.golemina +
		", sega iznesuva " + sega + this.golemina);
		System.out.println("Tipot na memorijata e " + this.tipNaMemorija);
		System.out.println("Noviot disk e " + this.ssd + " ima golemina od " +
		novSSDDisk + this.golemina +"." + "Prethodno imase " + this.disk + " i iznesuvase " + this.hardDisk + this.golemina);
		
	}
	
}


public class Main {
    public static void main(String[] args) {
    	
    	PC komp = new PC(2, "DDR4" , 160, "SSD m.2", "HDD", "GB");
    	
    	komp.Zgolemi(4, 200);
    	
    }
}