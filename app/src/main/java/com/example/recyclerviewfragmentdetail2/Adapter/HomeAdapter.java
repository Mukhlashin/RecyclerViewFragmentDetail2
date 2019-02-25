package com.example.recyclerviewfragmentdetail2.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewfragmentdetail2.DetailActivity;
import com.example.recyclerviewfragmentdetail2.R;

public class HomeAdapter extends RecyclerView.Adapter<HomsAdapter> {

    Context context;
    String[] namaTempat = {"Bantimurung Bulusaraung","Tanjung Bira","Danau Tempe","Permandian Air Panas Lejja","Malino","Pantai Losari","Benteng Rotterdam","Jalan Somba Opu","Pulau Takabonerate","Trans Studio"};
    String[] detail =
            {       "Taman Nasional Bantimurung berada di Kabupaten Maros atau sekitar 45 km dari pusat kota Makassar. Tempat wisata ini luasnya mencapai 43.750 hektar dengan wilayahnya yang melingkupi bukit kapur, air terjun dan juga gua.\n" +
                    "\n" +
                    "Taman nasional ini pertama kali ditemukan oleh seorang ahli botani dari Inggris, Alfred Russel Wallace. Saat itu, Wallace menyebut tempat ini sebagai kerajaan kupu-kupu karena ada sekitar 250 jenis kupu-kupu di sini. Kupu-kupu memang dijadikan maskot bagi tempat wisata ini. Di gerbang masuk Taman Nasional Bantimurung, terdapat sebuah patung kupu-kupu raksasa yang siap menyambut pengunjung yang datang.\n" +
                    "\n" +
                    "Di sini, Anda bisa melihat berbagai jenis kupu-kupu mulai dari yang masih berupa ulat, kepompong sampai berubah menjadi kupu-kupu yang cantik. Ada juga koleksi kupu-kupu yang telah diawetkan. Hal mengasyikan lain yang bisa Anda lakukan adalah bermain flying fox, berenang di kolam yang telah disediakan, bermain di bawah air terjun atau menjelajahi gua yang ada di kawasan ini.\n" +
                    "\n" +
                    "Untuk masuk ke Taman Nasional Bantimurung, Anda akan dikenakan biaya 20.000 Rupiah per orang.",
                    "Pantai ini berada cukup jauh yaitu sekitar 200 km dari kota Makassar. Jarak ini tak akan berarti saat Anda sudah menginjakkan kaki di atas pasirnya. Tanjung Bira terkenal dengan pasirnya yang selembut dan seputih bedak bayi serta airnya yang jernih kebiruan.\n" +
                            "\n" +
                            "Keindahan tempat wisata ini tak hanya dikenal oleh wisatawan domestik saja, tapi juga wisatawan mancanegara. Mereka biasa berenang, berjemur, snorkeling atau hanya duduk menikmati pemandangan terbit dan tenggelamnya matahari. Jika lupa membawa alat snorkeling, Anda bisa menyewanya seharga 30.000 Rupiah. Ada juga sepeda motor yang disewakan 65.000 Rupiah per hari untuk berkeliling kawasan pantai ini.\n" +
                            "\n" +
                            "Fasilitas di sini cukup lengkap, mulai dari penginapan, restoran dan juga kamar mandi untuk membersihkan diri setelah berenang. Tiket masuk ke Tanjung Bira adalah 5.000 Rupiah per orang.",
                    "Danau yang terletak di bagian barat Kabupaten Wajo ini disebut sebagai penghasil ikan tawar terbesar di dunia. Di atas danau, ada banyak rumah apung milik nelayan setempat dengan jala-jala yang digunakan untuk menangkap ikan.\n" +
                            "\n" +
                            "Di tempat wisata ini, Anda bisa memancing atau berkeliling dengan meyewa perahu nelayan. Selain itu, Anda juga bisa membeli ikan segar dan juga sayuran yang ditanam di sekitar danau.\n" +
                            "\n" +
                            "Setiap tanggal 23 Agustus, di sini diadakan sebuah ritual tahunan untuk menyucikan danau yang disebut dengan Maccera Tappareng. Kepala nelayan akan menyembelih seekor sapi, setelah itu akan ada banyak pertunjukan seni dan budaya serta berbagai lomba.",
                    "Pemandian air panas ini terletak di kawasan hutan lindung di Kecamatan Marioriawa, Kabupaten Soppeng. Pemandangan sekitar kolam pemandian sangat indah dengan banyak pepohonan rindang dan udaranya yang sejuk. Ada juga gazebo yang disewakan dengan tarif 50.000 Rupiah per dua jam.\n" +
                            "\n" +
                            "Di tempat wisata ini, terdapat lima buah kolam dengan kedalaman dan ukuran suhu yang beragam. Suhu terpanas dari sumber air ini adalah 60 derajat Celcius. Air panas ini dipercaya bisa menyembuhkan segala penyakit kulit dan rematik karena kandungan belerangnya. Untuk dapat berendam di kolam ini, Anda akan dikenakan biaya sebesar 5.000 Rupiah untuk dewasa dan 3.500 Rupiah untuk anak-anak.",
                    "Malino adalah tempat wisata yang berada di dataran tinggi dan menawarkan panorama khas pegunungan. Kawasan ini berada sekitar 90 km dari pusat kota Makassar. Selama perjalanan menuju Malino, Anda akan melewati pemandangan hutan pinus dan batu kapur yang indah.\n" +
                            "\n" +
                            "Malino berada di ketinggian 1.050 meter di atas permukaan laut. Suhu udara di sini berkisar antara 10 – 26 derajat Celcius, jangan sampai lupa membawa jaket dan pakaian hangat Anda. Kawasan ini sudah terkenal sejak zaman Belanda dan dijadikan tempat wisata favorit mereka.\n" +
                            "\n" +
                            "Di sini, ada banyak air terjun yang indah seperti Air Terjun Seribu Tangga dan Air Terjun Takapala. Selain itu, ada juga kebun teh, lembah biru dan bunker peninggalan Jepang. Sebelum pulang, sempatkan untuk membeli oleh-oleh khas tempat wisata ini seperti dodol ketan, buah markisa dan juga apel.",
                    "Mampir ke pantai yang berada di Jalan Penghibur ini sudah menjadi kegiatan wajib bagi setiap pengunjung yang datang ke Makassar. Tempat wisata andalan ini memiliki keunikan tersendiri. Jika biasanya pantai dikenal dengan pasirnya, Pantai Losari tidak memiliki pasir. Jika Anda datang, Anda akan menemui beton di tepiannya. Tidak ada pasir bukan berarti pantai ini tak layak dikunjungi, ada banyak hal lain yang menarik dari tempat wisata ini.\n" +
                            "\n" +
                            "Di sini, Anda bisa melakukan banyak hal yang menyenangkan seperti memancing, naik sepeda air atau banana boat, berlayar dengan perahu dan masih banyak lagi. Apa hal menarik lainnya dari sebuah tempat wisata? Tentu saja kulinernya. Ada banyak sajian kuliner khas Makassar yang bisa Anda nikmati di sini, mulai dari pisang epe, coto, sop konro sampai dengan es pallu butung.\n" +
                            "\n" +
                            "Tempat wisata di Makassar ini ramai dikunjungi setiap hari terutama saat akhir pekan. Pada pagi hari, banyak yang menjadikannya sebagai lintasan jogging, sedangkan pada sore hari, banyak yang menunggu momen matahari terbenam sambil berwisata kuliner di sini.",
                    "Benteng Rotterdam atau Fort Rotterdam ini berada tak jauh dari kawasan Pantai Losari. Benteng ini merupakan salah satu peninggalan sejarah Kerajaan Gowa-Tallo yang dibangun pada tahun 1545 oleh raja ke-9. Pada awalnya, benteng dibangun dengan menggunakan tanah liat dan putih telur, sampai kemudian bangunan disempurnakan oleh raja ke-14.\n" +
                            "\n" +
                            "Jika dilihat dari atas, bentuk benteng ini menyerupai seekor penyu yang sedang merangkak ke arah laut. Penyu dipilih karena binatang ini dapat hidup di air dan di darat, hal ini sesuai dengan Keajaan Gowa-Tallo yang berjaya di lautan maupun daratan.\n" +
                            "\n" +
                            "Nama awal dari benteng ini adalah ‘Benteng Ujungpandang’ sampai pada saat benteng ini jatuh ke tangan Belanda dan berganti nama menjadi Fort Rotterdam. Nama ini menjadi populer sampai sekarang. Pada zaman Belanda, benteng ini digunakan sebagai tempat penyimpanan rempah-rempah hasil rampasan dari Indonesia bagian timur.\n" +
                            "\n" +
                            "Di dalam kompleks benteng, terdapat 13 bangunan dan lima buah menara dengan sebuah menara di pintu masuk, sedangkan empat buah menara lainnya ada di setiap sudut kawasan benteng. Ada juga sebuah museum yang disebut Museum La Galigo yang berisi koleksi benda-benda sisa kebesaran kerajaan dahulu. Selain itu, ada sebuah ruangan yang diyakini sebagai tempat pengasingan Pangeran Diponegoro.\n" +
                            "\n" +
                            "Tempat wisata ini buka setiap hari mulai pukul 08:00 sampai 18:00 dan gratis. Sedangkan untuk museum, Anda dikenakan biaya tiket masuk sebesar 7.500 Rupiah per orang, Museum La Galigo buka setiap Selasa – Minggu, mulai pukul 08:00 sampai 12:30.",
                    "Berlibur tak lengkap jika tak mengunjungi pusat oleh-oleh khas kota yang didatangi. Tidak jauh dari Pantai Losari dan Benteng Rotterdam, ada Jalan Somba Opu yang ramai digunakan sebagai tempat menjual dan mencari oleh-oleh khas Makassar, mulai dari kerajinan, makanan khas sampai dengan minyak gosok cap tawon.\n" +
                            "\n" +
                            "Minyak gosok cap tawon menjadi oleh-oleh populer yang diburu banyak wisatawan. Sekadar tips jika membeli minyak gosok ini, minyak dengan tutup botol berwarna putih memiliki efek yang lebih panas ketika menyentuh kulit. Hal ini dikarenakan kandungan minyak yang ada, sedangkan minyak gosok dengan tutup botol berwarna merah memiliki efek panas di bawah tutup putih. Namun tentu saja harga yang ditawarkan pun berbeda. Minyak dengan tutup putih lebih mahal dibanding tutup merah.\n" +
                            "\n" +
                            "Selain minyak gosok, yang populer lainnya adalah miniatur kapal phinisi dalam botol. Untuk miniatur berukuran kecil, harga yang ditawarkan adalah 75.000 – 100.000 Rupiah per buah. Pasar di Jalan Somba Opu ini buka mulai pagi sampai malam hari.",
                    "Taman laut ini berada di kota Benteng, Kepulauan Selayar. Tempat wisata ini merupakan surga bagi penyelam dan Anda yang suka snorkeling. Saat menyelam, Anda bisa berenang bersama ratusan jenis ikan, penyu dan kura-kura. Kecantikan terumbu karangnya juga membuat Anda semakin betah berlama-lama menyelam di sini.\n" +
                            "\n" +
                            "Saat terbaik untuk menyelam di taman laut ini adalah di antara bulan April – Mei. Pada saat itu, arus dan suhu air serta berbagai faktor pendukung lainnya sedang dalam kondisi baik sehingga jarak pandang saat menyelam pun menjadi sempurna.\n" +
                            "\n" +
                            "Untuk menyelam di tempat wisata ini, Anda harus mendapat izin dari Balai Taman Nasional dengan membawa kartu identitas yang masih berlaku. Biaya yang dikenakan adalah 25.000 Rupiah untuk wisatawan domestik dan 60.000 Rupiah untuk wisatawan mancanegara. Jika ingin menyewa peralatan menyelam, Anda harus menyiapkan uang 250.000 Rupiah.",
                    "Trans Studio Makassar menjadi sebuah ikon tempat wisata modern di kota ini. Dibuka pada tanggal 20 Mei 2009, Trans Studio berdiri di atas lahan seluas 2,7 hektar. Di dalamnya, terdapapat 21 wahana dan empat zona permainan yaitu Studio Central, Cartoon City, Lost City, dan Magic Corner.\n" +
                            "\n" +
                            "Tempat wisata ini buka setiap hari mulai pukul 10:00 sampai 19:00, kecuali pada akhir pekan dan hari libur nasional, Trans Studio Makassar buka sampai dengan pukul 21:00. Untuk tiket masuk, Anda akan dikenakan biaya sebesar 100.000 Rupiah pada hari biasa, 175.000 Rupiah pada akhir pekan dan 200.000 Rupiah saat ada event tertentu di sini."};
    int[] gambarTempat = {R.drawable.bantimurung, R.drawable.bira, R.drawable.danau_tempe, R.drawable.lejja, R.drawable.malino, R.drawable.pantai_losari, R.drawable.rotterdam, R.drawable.somba_opu, R.drawable.takabonerate, R.drawable.trans_studio};

    public HomeAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public HomsAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.adapter_homs, null);
        return new HomsAdapter(v, context);
    }

    @Override
    public void onBindViewHolder(@NonNull HomsAdapter homsAdapter, final int position) {
        homsAdapter.tv.setText(namaTempat[position]);
        homsAdapter.img.setImageResource(gambarTempat[position]);
        homsAdapter.ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(context, DetailActivity.class);
                move.putExtra("a", detail[position]);
                move.putExtra("b", gambarTempat[position]);
                context.startActivity(move);
            }
        });

    }

    @Override
    public int getItemCount() {
        return namaTempat.length;
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder {

        TextView tvNameCity;
        ImageView imgCity;
        RecyclerView rvHome;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameCity = itemView.findViewById(R.id.tv_homs);
            imgCity = itemView.findViewById(R.id.img_homs);
        }
    }
}
