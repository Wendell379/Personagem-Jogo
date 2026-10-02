public class Personagem {
        private String nome;
        private int vida;
        private int energia;
        private int nivel;


        public Personagem(String nome) {
            this.nome = nome;
            this.vida = 100;
            this.energia = 100;
            this.nivel = 1;
        }


        public void receberDano(int dano) {
            if (dano < 0) return;
            this.vida -= dano;

            if (this.vida <= 0) {
                this.vida = 0;
                IO.println(this.nome + " recebeu " + dano + " de dano e foi derrotado!");
            } else {
                IO.println(this.nome + " recebeu " + dano + " de dano. Vida restante: " + this.vida);
            }
        }


        public void atacar() {
            if (this.vida == 0) {
                IO.println(this.nome + " está derrotado e não pode atacar!");
                return;
            }

            int custoEnergia = 20;

            if (this.energia >= custoEnergia) {
                this.energia -= custoEnergia;
                IO.println(this.nome + " realizou um ataque! Energia restante: " + this.energia);
            } else {
                IO.println(this.nome + " não tem energia suficiente para atacar! Energia atual: " + this.energia);
            }
        }


        public void descansar() {
            if (this.vida == 0) {
                IO.println(this.nome + " está derrotado e não pode descansar!");
                return;
            }

            int quantidadeRecuperada = 25;
            this.energia += quantidadeRecuperada;


            if (this.energia > 100) {
                this.energia = 100;
            }

            IO.println(this.nome + " descansou e recuperou energia. Energia atual: " + this.energia);
        }


        public String getStatus() {
            if (this.vida > 0) {
                return "Vivo";
            } else {
                return "Derrotado";
            }
        }


        public String getNome() {
            return nome;
        }

        public int getVida() {
            return vida;
        }

        public int getEnergia() {
            return energia;
        }

        public int getNivel() {
            return nivel;
        }
    }