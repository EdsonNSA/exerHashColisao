package hashColisao;

public class EstruturaHashTable implements EstruturaDeDados{
    private Integer tabela[];
    

    public EstruturaHashTable()
    {
        tabela = new Integer[1110];
    }

    public int elemento (int chave)
    {
        return chave % 1110;
    }

    public int hash (int chave)
    {
        int porao = chave % 100; 
        return (porao +1110);
    }
    @Override
    public boolean insert(int chave) {
        int valor = elemento(chave);

           if (tabela[valor] != null){ 
            return false;
           }
            tabela[valor] = chave;
            return true;
           }

    @Override
    public boolean delete(int chave) 
    {
        int valor = elemento(chave);
        if (tabela[valor] != null)
        {
            tabela[valor] = null;
            return true;
        }
        return false;
        
    }
    @Override
    public int search(int chave) 
    {
        int valor = elemento(chave);

        if (tabela[valor] != null &&  
        tabela[valor] == chave)
        {
            return valor;
        } 
        return -1;
    }
}