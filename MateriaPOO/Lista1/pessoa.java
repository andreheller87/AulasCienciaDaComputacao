
/**
 * Escreva uma descrição da classe pessoa aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class pessoa
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
        private String nome;
        private char sexo;
        private String dataDeNascimento;
        private String estadoCivil;

    /**
     * Construtor para objetos da classe pessoa
     */
    public pessoa(String nome,char sexo,String dataDeNascimento)
    {
       this.setNome(nome);
        this.setSexo(sexo);
        
      
       this.setDataDeNascimento(dataDeNascimento);
    
        this.estadoCivil = "Solteiro";
        
        
        // inicializa variáveis de instância
        
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void setNome(String nome)
    {
        this.nome = nome;
        
        // ethiscreva seu código aqui     
   }
    public void setSexo(char sexo)
    {
         if(sexo == 'M' || sexo == 'F'){
        
        this.sexo = sexo;
    }
        // ethiscreva seu código aqui     
   }
   
    public void setDataDeNascimento(String data)
    {
        this.dataDeNascimento = data;
        
        // ethiscreva seu código aqui     
   }
   
    public void setEstadoCivil(String estadoCivil)
    {
        this.estadoCivil = estadoCivil;
        
        // ethiscreva seu código aqui     
   }
   
   public String getNome(){
    
    return this.nome;
    
    }
    
    public char getSexo(){
    
    return this.sexo;
    
    }
    
    public String getDataDeNascimento(){
    
    return this.dataDeNascimento;
    
    }
   public String getEstadoCivil(){
    
    return this.estadoCivil;
    
    }
}
