class Kit implements Vendavel {
    private int id;
    private String nome;
    private List<Vendavel> itens;

    public Kit(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Vendavel item) {
        itens.add(item);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        double precoTotal = 0;
        for (Vendavel item : itens) {
            precoTotal += item.getPreco();
        }
        return precoTotal * 0.9; // Desconto de 10%
    }
}
