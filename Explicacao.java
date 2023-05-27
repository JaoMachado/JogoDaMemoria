package com.example.jogodamemria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Explicacao extends AppCompatActivity implements View.OnClickListener {
    private ImageButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8;
    private Button bt0;
    private TextView tx1;
    private ImageView imgv1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explicacao);

        imgv1 = (ImageView) findViewById(R.id.imgv1);

        tx1 = (TextView) findViewById(R.id.tx1);

        bt0 = (Button) findViewById(R.id.bt0);
        bt0.setOnClickListener(this);

        bt1 = (ImageButton) findViewById(R.id.bt1);
        bt1.setOnClickListener(this);
        bt2 = (ImageButton) findViewById(R.id.bt2);
        bt2.setOnClickListener(this);
        bt3 = (ImageButton) findViewById(R.id.bt3);
        bt3.setOnClickListener(this);
        bt4 = (ImageButton) findViewById(R.id.bt4);
        bt4.setOnClickListener(this);
        bt5 = (ImageButton) findViewById(R.id.bt5);
        bt5.setOnClickListener(this);
        bt6 = (ImageButton) findViewById(R.id.bt6);
        bt6.setOnClickListener(this);
        bt7 = (ImageButton) findViewById(R.id.bt7);
        bt7.setOnClickListener(this);
        bt8 = (ImageButton) findViewById(R.id.bt8);
        bt8.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view==bt0){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }else if (view==bt1){
            imgv1.setImageResource(R.drawable.rinsfundo);
            tx1.setText("Os rins são dois órgãos localizados em ambos os lados da coluna vertebral, atrás das últimas costelas, e medem aproximadamente 12 centímetros. Pesam cerca de 150 gramas cada.\n" +
                    "\n" +
                    "São três as principais funções dos rins:\n" +
                    "-> eliminar as toxinas ou dejetos resultantes do metabolismo corporal: uréia, creatinina, ácido úrico, etc;\n" +
                    "-> manter um constante equilíbrio hídrico do organismo, eliminando o excesso de água, sais e eletrólitos, evitando, assim, o aparecimento de edemas (inchaços) e aumento da pressão arterial;\n" +
                    "-> atuar como órgãos produtores de hormônios: eritropoetina, que participa na formação de glóbulos vermelhos; a vitamina D, que ajuda a absorver o cálcio para fortalecer os ossos; e a renina, que intervém na regulação de pressão arterial.");
        }else if (view==bt2){
            imgv1.setImageResource(R.drawable.procariontefundo);
            tx1.setText("As células procariontes, também conhecidas como protocélulas ou células procarióticas, são células que não possuem um núcleo celular definido e, por isso, o material genético celular fica disperso no citoplasma.\n"
                    +"\nEstrutura da célula procarionte:\n-> Cápsula: reveste a célula externamente;\n" +
                    "-> Citoplasma: substância gelatinosa responsável por manter o formato da célula;\n" +
                    "-> DNA: carrega as informações genéticas da célula;\n" +
                    "-> Flagelo: possibilita a locomoção da célula;\n" +
                    "-> Membrana plasmática: controla a troca de substâncias da célula com o meio externo;\n" +
                    "-> Parede celular: confere forma à célula;\n" +
                    "-> Pilus: possibilita a fixação da bactéria ao meio;\n" +
                    "-> Ribossomo: estrutura responsável pela produção de proteínas.");
        }else if (view==bt3){
            imgv1.setImageResource(R.drawable.figadofundpo);
            tx1.setText("O fígado é considerado a maior glândula do corpo humano. Tem coloração vermelho-escuro e pode ser dividido em dois lobos, sendo o direito bem maior que o esquerdo. Funciona tanto como glândula exócrina, liberando secreções em uma superfície externa, quanto como glândula endócrina, já que também libera substâncias no sangue e nos vasos linfáticos. Localiza-se no lado direito do abdômen, sob o diafragma. Seu peso é de aproximadamente 1,3 a 1,5 kg nos adultos. " +
                    "Algumas funções do fígado são: Produzir proteínas nobres, desintoxicar o organismo, sintetizar o colesterol, secretar a bile, armazenar a glicose e filtrar micro-organismos:  " +
                    "-> Secretar a bile: a bile é produzida pelo fígado, armazenada na vesícula biliar e enviada ao intestino, onde funciona como detergente e ajuda na dissolução e aproveitamento das gorduras;\n" +
                    "-> Filtrar micro-organismos; entre outras. É um órgão com intensa capacidade de se regenerar.");
        }else if (view==bt4){
            imgv1.setImageResource(R.drawable.eucariontefundo);
            tx1.setText("As células eucariontes são aquelas que apresentam um núcleo verdadeiro. Nessas células, o material genético está envolvido por uma membrana nuclear, também chamada de carioteca, garantindo a proteção do DNA contra os movimentos do citoesqueleto da célula. Essas células possuem ainda membrana plasmática e um citoplasma, onde estão localizadas as organelas.\n" +
                    "Entre essas organelas, podemos citar:\n"
                    + "-> Mitocôndria: Organela responsável por produzir energia para a célula.\n" +
                    "-> Complexo golgiense: Organela responsável, entre outros processos, pela secreção de produtos elaborados pela célula.\n" +
                    "-> Retículo endoplasmático: Participa da síntese de algumas substâncias e da síntese da membrana.\n" +
                    "-> Cloroplasto: Organela das células eucariontes vegetais que são responsáveis pela fotossíntese.\n" +
                    "-> Citoesqueleto: Uma estrutura formada por proteínas que garante o formato da célula e a movimentação celular.");
        }else if (view==bt5){
            imgv1.setImageResource(R.drawable.dnafundo);
            tx1.setText("O DNA é um tipo de ácido nucleico que possui papel fundamental na hereditariedade, sendo considerado o portador da mensagem genética. É no DNA que estão codificadas todas as características de um ser vivo, que são únicas em cada indivíduo. \n" +
                    "Os ácidos nucleicos, que podem ser DNA ou RNA, são constituídos por uma pentose, um ácido fosfórico e uma base nitrogenada. No caso do DNA, a pentose é do tipo desoxirribose e as bases nitrogenadas são adenina, citosina, guanina e timina. O conjunto formado pela pentose, pelo ácido fosfórico e pela base nitrogenada forma o nucleotídeo.\n" +
                    "É importante destacar que todas as espécies vivas apresentam um DNA formado apenas por essas quatro bases nitrogenadas e o DNA de qualquer tecido de um indivíduo apresenta a mesma sequência de bases.");
        }else if (view==bt6){
            imgv1.setImageResource(R.drawable.coracaofundo);
            tx1.setText("O coração é um órgão do sistema cardiovascular responsável por bombear o sangue e garantir que, desse modo, ele chegue a todo o corpo. O coração dos seres humanos possui quatro cavidades: dois átrios e dois ventrículos. O número de cavidades pode ser um critério para diferenciar o coração dos grupos de vertebrados. O sangue chega ao coração pelos átrios e deixa o órgão pelos ventrículos.\n" +
                    "O coração humano está localizado entre os pulmões e atrás do nosso osso esterno, estando protegido, portanto, por nossa caixa torácica. O coração tem o tamanho de um punho fechado e pesa cerca de 300 gramas, e, apesar de relativamente pequeno, exerce uma grande função no nosso corpo: o bombeamento do sangue, proporcionando, desse modo, que os nutrientes e oxigênio cheguem às células e os resíduos do metabolismo possam ser levados para o local adequado para sua eliminação.");
        }else if (view==bt7){
            imgv1.setImageResource(R.drawable.cerebrofundo);
            tx1.setText("A cabeça guarda a parte mais sofisticada do nosso corpo: O cérebro, o órgão mais importante do sistema nervoso que controla o corpo todo. Ele é responsável pelas ações voluntárias e involuntárias do nosso corpo.\n" +
                    "As ações voluntárias são aquelas que nos permite ter vontade própria, como comer, falar, brincar, mexer o dedão do pé e muitas outras. Já as ações involuntárias são aquelas que fazemos sem perceber, como bater o coração, respirar, aquelas que o corpo faz mesmo quando você está dormindo.\n" +
                    "As células nervosas ou neurônios processam todas as informações fazendo com que o cérebro execute todas as suas tarefas. É como se o cérebro fosse uma empresa, e essas células, as operárias.\n" +
                    "Ao contrário da maioria das células do nosso corpo, que morrem e logo são substituídas por outras, os neurônios não se regeneram, ou seja, quando eles morrem não aparece ninguém para ficar no seu lugar.");
        }else if (view==bt8){
        imgv1.setImageResource(R.drawable.bacteriasfundo);
        tx1.setText("As bactérias são organismos procariontes e unicelulares, isto é, formadas por uma única célula, sem núcleo e com organelas ligadas à membrana. Elas podem viver isoladas ou reunidas em agrupamentos que possuem formas típicas e que variam entre as espécies. Elas pertenciam ao reino Monera, mas este foi extinto com a adoção da classificação dos seres vivos em domínios. Com isso, esses procariotos tornam-se parte do domínio Bacteria.\n" +
                "De forma geral, as bactérias medem entre 0,2 e 1,5 nm de comprimento e apresentam um envoltório externo rígido, chamado de parede bacteriana, que determina a forma e protege a bactéria contra agressões físicas do meio ambiente. Sob a parede celular, encontra-se a membrana plasmática, que delimita o citoplasma, fluido onde há milhares de proteínas e organelas responsáveis pelo metabolismo da bactéria.");
        }
    }
}
