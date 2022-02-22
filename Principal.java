public class Principal {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        empregado.setNome("Amabile");
        empregado.setEndereco("Pompeia");
        empregado.setTelefone("ZZZ");
        empregado.setSalario(1800);
        System.out.println(empregado.getNome());
        System.out.println(empregado.getEndereco());
        System.out.println(empregado.getTelefone());
        System.out.println(empregado.getSalario());
        Empregado empregado2=new Empregado();
        //settar com os seus dados
        empregado2.setNome("Isaque");
        empregado2.setEndereco("Palmital");
        empregado2.setEndereco("XXXXXXX");
        empregado2.setSalario(1700);
        System.out.println(empregado2.getNome());

    }
}
