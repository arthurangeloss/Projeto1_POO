import java.util.Scanner;

class Aluno {
    private String nome;
    private int matricula;
    private double notaAV1;
    private double notaAV2;
    private double notaAE;
    private String curso;
    private int periodo;

    public Aluno(String nome, int matricula, double notaAV1, double notaAV2, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.curso = curso;
        this.periodo = periodo;
    }

    public void alteraNotaAV1(double notaAV1) {
        this.notaAV1 = notaAV1;
    }

    public void alteraNotaAV2(double notaAV2) {
        this.notaAV2 = notaAV2;
    }

    public void alteraNotaAE(double notaAE) {
        this.notaAE = notaAE;
    }

    public void avaliarAluno() {
        double notaTotal = this.notaAV1 + this.notaAV2;
        if (notaTotal >= 60) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Recuperação");
            
        }
    }

    public void avaliarRecuperacao(double notaAE) {
        double notaTotal = (this.notaAV1 + this.notaAV2 + notaAE) / 3;
        if (notaTotal >= 60) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite o número da matrícula: ");
        int matricula = sc.nextInt();

        System.out.print("Digite a nota da AV1: ");
        double notaAV1 = sc.nextDouble();

        System.out.print("Digite a nota da AV2: ");
        double notaAV2 = sc.nextDouble();

        System.out.print("Digite o curso: ");
        String curso = sc.next();

        System.out.print("Digite o período: ");
        int periodo = sc.nextInt();

        Aluno aluno = new Aluno(nome, matricula, notaAV1, notaAV2, curso, periodo);
        aluno.avaliarAluno();

        System.out.print("Digite a nota da AE: ");
        double notaAE = sc.nextDouble();

        aluno.alteraNotaAE(notaAE);
        aluno.avaliarRecuperacao(notaAE);

        sc.close();
    }
}