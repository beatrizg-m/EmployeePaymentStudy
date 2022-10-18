package Entities;

public class FuncionarioTerceirizado extends Funcionario{

    private Double despesaAdicional;

    public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double despesaAdicional){
        super(nome, horas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public double getdespesaAdicional(){
        return despesaAdicional;
    }

    public void setdespesaAdicional(Double despesaAdicional){
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + despesaAdicional * 1.1;
    }

}