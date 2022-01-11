/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cadastropacientes.model;

/**
 *
 * @author hp user
 */
//Variáveis dos atributos
public class Paciente {
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String numCartaoSus;
    private String Cpf;
    private String RG;
    private String Cidade;
    private String Endereço;
    private String Telefone;
    private String TipoSanguinio;
    private String Alergias;
    private String RemediosControlados;
    private String Doencas;
    private String Deficiencia;
    private String Cirurgias;
    private String Pressao;
    private String Glicose;
    private String Peso;
    private String Altura;
    private String AtividadesFisicas;
    private String Temperatura;
    private String PlanoDeSaude;
    
    
  
    //Construtor
    public Paciente(){
       this.nome = "";   
       this.dataNascimento = "";   
       this.sexo = "";   
       this.Cpf = "";   
       this.RG = ""; 
       this.Cidade = "";  
       this.Endereço = "";
       this.Telefone = ""; 
       this.numCartaoSus = ""; 
       this.TipoSanguinio = "";
       this.Alergias = "";   
       this.RemediosControlados = "";   
       this.Doencas = "";   
       this.Deficiencia = ""; 
       this.Cirurgias = "";  
       this.Pressao = "";
       this.Glicose = ""; 
       this.Peso = ""; 
       this.Altura = ""; 
       this.AtividadesFisicas = ""; 
       this.Altura = "";
       this.Temperatura = "";
       this.PlanoDeSaude = ""; 
    }
   //Este cnstrutor vai receber todos os dados iniciado diretamente 
   // Vamos colocar o método this, para referir as variáveis que estão dentro da classe,e essas variáveis vão receber os parâmetros dos contrutores que estão dentro do parentes 
    public Paciente (String nome, String dataNascimento,String sexo, String numCartaoSus,String Cpf, String RG,
   String Cidade, String Endereço, String Telefone, String TipoSanguinio, String Alergias, String RemediosControlados,
   String Doencas,String Deficiencia,String Cirurgias, String Pressao,String Glicose,String Peso,String Altura,
   String AtividadesFisicas,String Temperatura, String PlanoDeSaude){
        
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.numCartaoSus = numCartaoSus;
        this.Cpf = Cpf;   
        this.RG = RG; 
        this.Cidade = Cidade;  
        this.Endereço = Endereço;
        this.TipoSanguinio = TipoSanguinio;
        this.Alergias = Alergias;   
        this.RemediosControlados = RemediosControlados;   
        this.Doencas = Doencas;   
        this.Deficiencia = Deficiencia; 
        this.Cirurgias = Cirurgias;  
        this.Pressao = Pressao;
        this.Glicose = Glicose; 
        this.Peso = Peso; 
        this.Altura = Altura; 
        this.AtividadesFisicas = AtividadesFisicas; 
        this.Altura = Altura;
        this.Temperatura = Temperatura; 
        this.PlanoDeSaude = PlanoDeSaude; 
    }
    
    //Métodos Getter / Setter

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the numCartaoSus
     */
    public String getNumCartaoSus() {
        return numCartaoSus;
    }

    /**
     * @param numCartaoSus the numCartaoSus to set
     */
    public void setNumCartaoSus(String numCartaoSus) {
        this.numCartaoSus = numCartaoSus;
    }

    /**
     * @return the Cpf
     */
    public String getCpf() {
        return Cpf;
    }

    /**
     * @param Cpf the Cpf to set
     */
    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
    }

    /**
     * @return the Cidade
     */
    public String getCidade() {
        return Cidade;
    }

    /**
     * @param Cidade the Cidade to set
     */
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    /**
     * @return the Endereço
     */
    public String getEndereço() {
        return Endereço;
    }

    /**
     * @param Endereço the Endereço to set
     */
    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * @return the TipoSanguinio
     */
    public String getTipoSanguinio() {
        return TipoSanguinio;
    }

    /**
     * @param TipoSanguinio the TipoSanguinio to set
     */
    public void setTipoSanguinio(String TipoSanguinio) {
        this.TipoSanguinio = TipoSanguinio;
    }

    /**
     * @return the Alergias
     */
    public String getAlergias() {
        return Alergias;
    }

    /**
     * @param Alergias the Alergias to set
     */
    public void setAlergias(String Alergias) {
        this.Alergias = Alergias;
    }

    /**
     * @return the RemediosControlados
     */
    public String getRemediosControlados() {
        return RemediosControlados;
    }

    /**
     * @param RemediosControlados the RemediosControlados to set
     */
    public void setRemediosControlados(String RemediosControlados) {
        this.RemediosControlados = RemediosControlados;
    }

    /**
     * @return the Doencas
     */
    public String getDoencas() {
        return Doencas;
    }

    /**
     * @param Doencas the Doencas to set
     */
    public void setDoencas(String Doencas) {
        this.Doencas = Doencas;
    }

    /**
     * @return the Deficiencia
     */
    public String getDeficiencia() {
        return Deficiencia;
    }

    /**
     * @param Deficiencia the Deficiencia to set
     */
    public void setDeficiencia(String Deficiencia) {
        this.Deficiencia = Deficiencia;
    }

    /**
     * @return the Cirurgias
     */
    public String getCirurgias() {
        return Cirurgias;
    }

    /**
     * @param Cirurgias the Cirurgias to set
     */
    public void setCirurgias(String Cirurgias) {
        this.Cirurgias = Cirurgias;
    }

    /**
     * @return the Pressao
     */
    public String getPressao() {
        return Pressao;
    }

    /**
     * @param Pressao the Pressao to set
     */
    public void setPressao(String Pressao) {
        this.Pressao = Pressao;
    }

    /**
     * @return the Glicose
     */
    public String getGlicose() {
        return Glicose;
    }

    /**
     * @param Glicose the Glicose to set
     */
    public void setGlicose(String Glicose) {
        this.Glicose = Glicose;
    }

    /**
     * @return the Peso
     */
    public String getPeso() {
        return Peso;
    }

    /**
     * @param Peso the Peso to set
     */
    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    /**
     * @return the Altura
     */
    public String getAltura() {
        return Altura;
    }

    /**
     * @param Altura the Altura to set
     */
    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    /**
     * @return the AtividadesFisicas
     */
    public String getAtividadesFisicas() {
        return AtividadesFisicas;
    }

    /**
     * @param AtividadesFisicas the AtividadesFisicas to set
     */
    public void setAtividadesFisicas(String AtividadesFisicas) {
        this.AtividadesFisicas = AtividadesFisicas;
    }

    /**
     * @return the Temperatura
     */
    public String getTemperatura() {
        return Temperatura;
    }

    /**
     * @param Temperatura the Temperatura to set
     */
    public void setTemperatura(String Temperatura) {
        this.Temperatura = Temperatura;
    }

    /**
     * @return the PlanoDeSaude
     */
    public String getPlanoDeSaude() {
        return PlanoDeSaude;
    }

    /**
     * @param PlanoDeSaude the PlanoDeSaude to set
     */
    public void setPlanoDeSaude(String PlanoDeSaude) {
        this.PlanoDeSaude = PlanoDeSaude;
    }

    
    
}
