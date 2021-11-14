import java.util.Scanner;

class Br {
    private int Br;

    Br() { this.Br = 0; }

    void resBr() { this.Br = 0; }

    void zgolBr() { this.Br += 1; }

    void zgolBr(int n) { this.Br += n; }

    int kolku() { return Br; }
}

public class Main2 {
	
    public static void main(String[] args) {
        Br a = new Br();
        Br b = new Br();

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Pismo - " + b.kolku());
            System.out.println("Glava - " + a.kolku());
            System.out.println("");
            System.out.println("1 - Frlaj paricka");
            System.out.println("2 - Resetiraj brojac na pismo");
            System.out.println("3 - Resetiraj brojac na glava");
            System.out.println("4 - Zgolemi brojac na pismo");
            System.out.println("5 - Zgolemi brojac na glava");
            System.out.println("0 - Izlezi");

            int izbor = sc.nextInt();

            if(izbor == 1) {
                while(true) {
                    System.out.println("Glava - " + a.kolku());
                    System.out.println("Pismo - " + b.kolku());
                    System.out.println("Vnesi 1 za da frlis, 0 za da prestanis so frlanje");
                    int frli = sc.nextInt();
                    if(frli != 0) {
                        if(Math.random() < 0.5) {
                            a.zgolBr();
                        }
                        else {
                            b.zgolBr();
                        }
                    }
                    else {
                        break;
                    }
                }
            }
            else if(izbor == 2) {
                b.resBr();
            }
            else if(izbor == 3) {
                a.resBr();
            }
            else if(izbor == 4) {
                System.out.print("Pati: ");
                int pati = sc.nextInt();
                b.zgolBr(pati);
            }
            else if(izbor == 5) {
                System.out.print("Pati: ");
                int pati = sc.nextInt();
                a.zgolBr(pati);
            }
            else if(izbor == 0)
                break;
        }
    }
}
