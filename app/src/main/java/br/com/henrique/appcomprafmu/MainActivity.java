package br.com.henrique.appcomprafmu;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import br.com.henrique.appcomprafmu.Adapter.ProdutoAdapter;
import br.com.henrique.appcomprafmu.databinding.ActivityMainBinding;
import br.com.henrique.appcomprafmu.model.Produto;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ProdutoAdapter produtoAdapter;
    private ArrayList<Produto> produtolist = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewProduto = binding.RecyclerViewProduto;
        recyclerViewProduto.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewProduto.setHasFixedSize(true);
        produtoAdapter = new ProdutoAdapter(produtolist,this);
        recyclerViewProduto.setAdapter(produtoAdapter);
        getProduto();
    }
    private void getProduto(){

        Produto produto1 = new Produto(
        R.drawable.CELULAR1,
        "Iphone 14",
        "iPhone 14 chega como o novo modelo padrão da principal linha da Apple em 2022. As principais melhorias estão no aplicativo de câmera. Por exemplo, mantém a tela de 6,1 polegadas OLED de 60 Hz.",
        "$ 7.500"
        );
        produtolist.add(produto1);


        Produto produto2 = new Produto(
                R.drawable.CELULAR2,
                "Samsung s24",
                "Smartphone Samsung Galaxy S24+, Galaxy AI, Selfie de 12MP, Tela de 6.7\" 1-120Hz, 512GB, 12GB RAM.",
                "$ 4.800"
        );
        produtolist.add(produto2);


        Produto produto3 = new Produto(
                R.drawable.CELULAR3,
                "Cat s42 h+",
                "Memória RAM: 3 GB, tela IPS de 5.5\", câmera frontal de 5Mpx, processador MediaTek MT6761D Helio A20 Quad-Core de 1.8GHz com 3GB de RAM, bateria de 4200mAh, Memória interna de 32GB, a prova d'água, resistente a poeira e as quedas.",
                "$ 1.900"
        );
        produtolist.add(produto3);


        Produto produto4 = new Produto(
                R.drawable.CELULAR4,
                "Poco X6",
                "Smartphone Xiaomi POCO X6 Pro 5G 12GB+512GB NFC Dimensity 8300-Ultra 64MP triple camera 67W 120Hz AMOLED Global Version.",
                "$ 2.500"
        );
        produtolist.add(produto4);


        Produto produto5 = new Produto(
                R.drawable.CELULAR5,
                "Cubot kingkong 9",
                "CUBOT Kingkong 9 Indestructible Phone 2023 Android 13, 6,5 polegadas 120Hz, 24GB+256GB/1TB expansível, câmera de 100MP+32MP, bateria de 10600mAh, Octa-Core 2.2Ghz/NFC/OTG/Face ID/GPS/4G Dual SIM Card",
                "$ 3.100"
        );
        produtolist.add(produto5);

    }
}
