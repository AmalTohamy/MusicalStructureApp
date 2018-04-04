package tohamy.amal.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> songList;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<Song> singer = new ArrayList<>();
        singer.add(new Song("Umm Kulthum", R.drawable.umm_kulthum));
        singer.add(new Song("Abdel Halim Hafez", R.drawable.abdel_halim_hafez));
        singer.add(new Song("Shadia", R.drawable.shadia));
        singer.add(new Song("Mohammed Abdel Wahab", R.drawable.mohammed_abdel_wahab));
        singer.add(new Song("Najat Al Saghira", R.drawable.najat_al_saghira));
        singer.add(new Song("Saad Abdel Wahab", R.drawable.saad_abdel_wahab));
        singer.add(new Song("Sabah", R.drawable.sabah));
        singer.add(new Song("Farid al-Atrash", R.drawable.farid_al_atrash));
        singer.add(new Song("Asmahan", R.drawable.asmahan));
        singer.add(new Song("Leila Mourad", R.drawable.leila_mourad));
        singer.add(new Song("Soad Mohammed", R.drawable.soad_mohammed));
        singer.add(new Song("Mohamed Abd Elmotelb", R.drawable.mohamed_adb_elmotelb));
        singer.add(new Song("Sayed Mekawy", R.drawable.sayed_mekawy));
        singer.add(new Song("Mohamed Roshdy", R.drawable.mohamed_roshdy));
        singer.add(new Song("Mohamed Kandil", R.drawable.mohamed_kandil));
        singer.add(new Song("Mohamed Fawzy", R.drawable.mohamed_fawzy));

        CustomAdapter adapter = new CustomAdapter(this, singer);

        ListView listView = findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this, SongList.class);
                songList = new ArrayList<>();
                if (singer.get(position).getmDefaultArtist().equals("Umm Kulthum")) {
                    songList.add("Amal Hayati");
                    songList.add("Ana F'entezarak");
                    songList.add("Al-Atlal");
                    songList.add("Enta Omri");
                    songList.add("Esaal Rohak");
                    songList.add("El-Hobb Keda");
                    songList.add("Siret El-Hobb");
                    songList.add("Rubaiyat Al-Khayyam");
                    songList.add("Lessa Faker");
                    songList.add("Lel-Sabr Hodood");
                    songList.add("Leilet Hobb");
                    songList.add("Koll El-Ahebba");
                    songList.add("Howwa Sahih El-Hawa Ghallab");
                    songList.add("Hobb Eih");
                    songList.add("Hazihi Laylati");
                    songList.add("Hayyart Qalbi");
                    songList.add("Hasibak Lel-Zaman");
                    songList.add("Hagartak");
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra("songList", songList);
                    intent.putExtra("image", image);
                    intent.putExtra("artist", "Umm Kulthum");
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals("Abdel Halim Hafez")) {
                    songList.add("Zay El Hawa");
                    songList.add("Ahwak");
                    songList.add("Gana El Hawa");
                    songList.add("Sawah");
                    songList.add("Mawood");
                    songList.add("Safini Marra");
                    songList.add("Ana Lak Ala Toul");
                    songList.add("Zalamoh");
                    songList.add("Haga Ghariba");
                    songList.add("Last adry");
                    songList.add("Hobak Nar");
                    songList.add("Asmar Ya Asmarani");
                    songList.add("Habebaty Man Takon");
                    songList.add("Qareat Al Fengan");
                    songList.add("Resala Men Taht El Maa");
                    songList.add("Al Toba");
                    songList.add("Ala Qad El Shouq");
                    songList.add("Fatet Ganbena");
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra("songList", songList);
                    intent.putExtra("image", image);
                    intent.putExtra("artist", "Abdel Halim Hafez");
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals("Shadia")) {
                    songList.add("En Rah Menek Ya Ain");
                    songList.add("Ah ya smarany loun");
                    songList.add("Wehiat Eineik");
                    songList.add("Khodny Maak");
                    songList.add("Sona");
                    songList.add("Ya Habebty Ya Masr");
                    songList.add("Shebakna Satairoh");
                    songList.add("Belhadawa");
                    songList.add("El Telephon");
                    songList.add("Ya Alby Sebak");
                    songList.add("Diblit Al Khoutouba");
                    songList.add("Seed El Habaib");
                    songList.add("Akher layela");
                    songList.add("Fouk Ya Alby");
                    songList.add("Al shams banit");
                    songList.add("Ah ya lamouny");
                    songList.add("Abyad ya ward");
                    songList.add("Mesh Oltelak Ya Alby");
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra("songList", songList);
                    intent.putExtra("image", image);
                    intent.putExtra("artist", "Shadia");
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals("Mohammed Abdel Wahab")) {
                    songList.add("Msafer");
                    songList.add("Gafnouhou");
                    songList.add("Balash Tebosny");
                    songList.add("Ya Donia Ya Gharamy");
                    songList.add("Madnak");
                    songList.add("Ya Wabour");
                    songList.add("Kan Agmal Yom");
                    songList.add("Msafer Wahdak");
                    songList.add("Hob El Watan");
                    songList.add("Ennahr Elkhaled");
                    songList.add("El Karnak");
                    songList.add("Ya Wardet El Hob");
                    songList.add("Hakem Oyon");
                    songList.add("Han El Wed");
                    songList.add("Al Gondool");
                    songList.add("Hayaty Enta");
                    songList.add("Men Gheir Leh");
                    songList.add("La' Mush Ana Elli Abki");
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra("songList", songList);
                    intent.putExtra("image", image);
                    intent.putExtra("artist", "Mohammed Abdel Wahab");
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals("Najat Al Saghira")) {
                    songList.add("El Arieb Menk");
                    songList.add("Ana Bashaa El Bahr");
                    songList.add("Ana Bastanak");
                    songList.add("Ettir El-Messafer");
                    songList.add("Saal Fi");
                    songList.add("Bahlam Maak");
                    songList.add("Kol Fen W Fen");
                    songList.add("Law Ytoll El Boed");
                    songList.add("Halawet El Hob");
                    songList.add("Ayazon");
                    songList.add("La Tantaked Khajali");
                    songList.add("Enta Enta");
                    songList.add("Ayoun el alb");
                    songList.add("Sahran ya amar");
                    songList.add("Wahdiah");
                    songList.add("Saat Ma Bachoufak Ganbi");
                    songList.add("Fe West El Tareek");
                    songList.add("Leh Khaletny Ahebak");
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra("songList", songList);
                    intent.putExtra("image", image);
                    intent.putExtra("artist", "Najat Al Saghira");
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals("Saad Abdel Wahab")) {
                    songList.add("El Donya Risha");
                    songList.add("Fil Leil Lama Khili");
                    songList.add("Elyoumein Dhoul");
                    songList.add("Ala Fein Wakhedni Eneik");
                    songList.add("Enta Wei Yaya Weil Hana Maaya");
                    songList.add("Ah Men Habibi");
                    songList.add("Fein Ganet Ahlamy");
                    songList.add("El Shabab Weil Roh");
                    songList.add("Ehgerni Shawaya Shwaya");
                    songList.add("Shababak Enta Wei Eyounak Enta");
                    songList.add("Albi El Asy");
                    songList.add("Men Khatwa Lei Khatwa");
                    songList.add("Helwein Kida Leih Teemin Kida Leih");
                    songList.add("Ma Betessalsh Leih");
                    songList.add("El Yomein Dol Alby Malo");
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra("songList", songList);
                    intent.putExtra("image", image);
                    intent.putExtra("artist", "Saad Abdel Wahab");
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals("Sabah")) {
                    songList.add("Yana Yana");
                    songList.add("Saat Saat");
                    songList.add("Zay el assal");
                    songList.add("Ana Hena");
                    songList.add("Ya Dalaa Dalaa");
                    songList.add("El Helwa");
                    songList.add("Sho Esmak");
                    songList.add("Balash Ya Alby");
                    songList.add("Aashka We Meskina");
                    songList.add("Amourti El Helwa");
                    songList.add("El Helo Leh Ta2lan");
                    songList.add("El Donya Ehlawet Eddami");
                    songList.add("El Dawama");
                    songList.add("Jani We Talab El Samah");
                    songList.add("Habibat Omaha");
                    songList.add("Ala Einy");
                    songList.add("Hona El Qahera");
                    songList.add("Ya Msafer");
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra("songList", songList);
                    intent.putExtra("image", image);
                    intent.putExtra("artist", "Sabah");
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals("Farid al-Atrash")) {
                    songList.add("Hebbina hebbina");
                    songList.add("Gamil Gamal");
                    songList.add("Noura Ya Noura");
                    songList.add("Ya Zahratan Fi Khayali");
                    songList.add("Ya Gamil Ya Gamil");
                    songList.add("Wayak Wayak");
                    songList.add("Hekayet Gharami");
                    songList.add("Ya Ritni Tir");
                    songList.add("Zaman Ya Hob");
                    songList.add("Awel Hamsa");
                    songList.add("Adnaytani Bil Hajr");
                    songList.add("Daimen Maak");
                    songList.add("Esma Maktouba");
                    songList.add("Manheremsh El-Omr");
                    songList.add("Isma'e Lamma A'oullak");
                    songList.add("Bahibbak Mahma Alo Annak");
                    songList.add("Ya Habibi Tal Gheyabak");
                    songList.add("Ghali Ya Bouy");
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra("songList", songList);
                    intent.putExtra("image", image);
                    intent.putExtra("artist", "Farid al-Atrash");
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals("Asmahan")) {
                    songList.add("Ya Habibi Taala");
                    songList.add("Ya touyour");
                    songList.add("Yalli Hawak");
                    songList.add("Ahwa");
                    songList.add("Ya habibi taala elhaani");
                    songList.add("Dakhalti marrah");
                    songList.add("Ya min yeqhol ahwa");
                    songList.add("Layta Lel Barrak");
                    songList.add("Ya dirati");
                    songList.add("Elward");
                    songList.add("Askiniha");
                    songList.add("Ya Layali Elbichar");
                    songList.add("Emta Tioud");
                    songList.add("Konti Elamani");
                    songList.add("Elouyoun");
                    songList.add("Emta Hateraf");
                    songList.add("Layali elouns");
                    songList.add("Ayoha naimo");
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra("songList", songList);
                    intent.putExtra("image", image);
                    intent.putExtra("artist", "Asmahan");
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals("Leila Mourad")) {
                    songList.add("Ana Alby Dalily");
                    songList.add("Esaal Alaia");
                    songList.add("Aini Bitref");
                    songList.add("Ana zay mana");
                    songList.add("Sanatin Waana Ahayil Fik\n");
                    songList.add("El Dounia Ghenoua");
                    songList.add("Etlob Enaya");
                    songList.add("Rah el hawa");
                    songList.add("Malich Amal");
                    songList.add("Yalla Taala Awam");
                    songList.add("Hayrana leh");
                    songList.add("Akteblak Gawabat");
                    songList.add("Abgad Hawaz");
                    songList.add("Ana Ahibak");
                    songList.add("Leh Khaletni Ahebak");
                    songList.add("Raydak");
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra("songList", songList);
                    intent.putExtra("image", image);
                    intent.putExtra("artist", "Leila Mourad");
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals("Soad Mohammed")) {
                    songList.add("Wahashtini");
                    songList.add("Mazlouma");
                    songList.add("Rah El Hob");
                    songList.add("Men Gheir Hob");
                    songList.add("Ashreqy Shams El Hoda");
                    songList.add("Ana Haweit");
                    songList.add("Achouq Ya Bouy");
                    songList.add("Kam Nashd El Mokhtar");
                    songList.add("Hasbaho Allah Maah");
                    songList.add("Wa Gareeha");
                    songList.add("Nehayet El Hekaya");
                    songList.add("Ya Habeibty Ya Ghalia");
                    songList.add("Salam Wy Kallam");
                    songList.add("Eddi El Haya Forssa");
                    songList.add("Shyi Ghareeb");
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra("songList", songList);
                    intent.putExtra("image", image);
                    intent.putExtra("artist", "Soad Mohammed");
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals("Mohamed Abd Elmotelb")) {
                    songList.add("Bayaa Elhawa");
                    songList.add("Elsabt Faat");
                    songList.add("Ahll Elmhaba");
                    songList.add("Ya Abo Eleeyon Elsod");
                    songList.add("Ya Ahl Elbalad");
                    songList.add("Betsleny Bahebk Leh");
                    songList.add("Habetk Wbhebak");
                    songList.add("Atshan Ya Sabaya");
                    songList.add("Wana Maly");
                    songList.add("Teslm Eden Eleshtra");
                    songList.add("Anta Mesh Andk Habib");
                    songList.add("Ya Byene Wana Share");
                    songList.add("Wadaa Hawak");
                    songList.add("Fe Alby Gram");
                    songList.add("Elmrtahen Fe Elhob");
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra("songList", songList);
                    intent.putExtra("image", image);
                    intent.putExtra("artist", "Mohamed Abd Elmotelb");
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals("Sayed Mekawy")) {
                    songList.add("Ya Salat El Zein");
                    songList.add("El Ward Gamil");
                    songList.add("Esha Ya Nayem");
                    songList.add("Helween Men Yomna");
                    songList.add("Esaal Marra Aleya");
                    songList.add("Habibi Yeseed Awaato");
                    songList.add("Ya Halawet El Donia");
                    songList.add("El Ayam El Helwa");
                    songList.add("Yalli Teheb El Fan");
                    songList.add("Balash Moanda");
                    songList.add("Shawerli");
                    songList.add("Khally Shwaya Aliek");
                    songList.add("Awaaty Betehlaw");
                    songList.add("Laylt Imbarih");
                    songList.add("Keda Yehlaw El-Kalam");
                    songList.add("Agaby");
                    songList.add("Ya Nas La Mesh Keda");
                    songList.add("Mesh Ketir Ala Alby");
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra("songList", songList);
                    intent.putExtra("image", image);
                    intent.putExtra("artist", "Sayed Mekawy");
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals("Mohamed Roshdy")) {
                    songList.add("Tayer Ya Hawa");
                    songList.add("Meta Ashofak");
                    songList.add("Enta Meen");
                    songList.add("Kaeb El Ghazal");
                    songList.add("Ya Amar Eskandarany");
                    songList.add("Ya Baraket Ramadan Khaleeky");
                    songList.add("Al Ramla");
                    songList.add("Akhtarlak Sahab");
                    songList.add("Qtr El Hayat");
                    songList.add("Shaka Omry");
                    songList.add("Khalek Ya Alby Tayab");
                    songList.add("Moghram Sababa");
                    songList.add("Al Habayab Al Ghadareen");
                    songList.add("Howa Fy Aah");
                    songList.add("Argook Habeby");
                    songList.add("Biaa El Kanadel");
                    songList.add("Damit Lmin");
                    songList.add("Mazoon Elbalad");
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra("songList", songList);
                    intent.putExtra("image", image);
                    intent.putExtra("artist", "Mohamed Roshdy");
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals("Mohamed Kandil")) {
                    songList.add("Talat Salamat");
                    songList.add("Abou Samra");
                    songList.add("En Getna Ya Gamil");
                    songList.add("El Helw Abo Shama");
                    songList.add("Hawen Ya Mehawen");
                    songList.add("Gamil Wasmar");
                    songList.add("Ya Helw Sabah");
                    songList.add("Khalek Ma'anesna");
                    songList.add("Yally Maaya");
                    songList.add("Wehda");
                    songList.add("Kobry Abou El 3ela");
                    songList.add("Fakartony");
                    songList.add("Ololy A3mel Eh");
                    songList.add("Been Shaten We Maya");
                    songList.add("Mashy Kalamk");
                    songList.add("Inshallah Ma3dmak");
                    songList.add("Ya Labsa El Masha Allah");
                    songList.add("Ana we Habiby");
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra("songList", songList);
                    intent.putExtra("image", image);
                    intent.putExtra("artist", "Mohamed Kandil");
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals("Mohamed Fawzy")) {
                    songList.add("Mal El Amar Malo");
                    songList.add("Tamly Fe Alby");
                    songList.add("Hato El Fawanees");
                    songList.add("Teer Bena Ya Alby");
                    songList.add("Dary El3youn");
                    songList.add("Kalmny Wa Tameny");
                    songList.add("Mama Zamanha Gaya");
                    songList.add("Ya Welad Baldna");
                    songList.add("Kan Badri Alik");
                    songList.add("Ya Bakhtat Ya");
                    songList.add("Ya Salam");
                    songList.add("Fatafet El Sokar");
                    songList.add("Ay Wallah");
                    songList.add("Rah Tewhacheni");
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra("songList", songList);
                    intent.putExtra("image", image);
                    intent.putExtra("artist", "Mohamed Fawzy");
                    startActivity(intent);
                }
            }
        });

    }
}
