public class EmpregadoDaFaculdade {
    private String nome;
    private double salario;
    private int horasAula;

    double getGastos() {
        return this.salario + (this.horasAula * 40);
    }

    String getInfo() {
        return "nome: " + this.nome + ", com salário: R$" + (this.salario + (this.horasAula * 40));
    }

    public static void main(String[] args) {
        EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade();
        empregado.nome = "João";
        empregado.salario = 2000.00;
        empregado.horasAula = 20;

        System.out.println("Gastos: R$" + empregado.getGastos());
        System.out.println(empregado.getInfo());
    }
}