
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Funcionario();
		nico.setNome("Nic Stepat");
		nico.setCpf("2454587456");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
