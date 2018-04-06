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
        singer.add(new Song(getString(R.string.umm_kulthum), R.drawable.umm_kulthum));
        singer.add(new Song(getString(R.string.abdelhalim_hafez), R.drawable.abdel_halim_hafez));
        singer.add(new Song(getString(R.string.shadia), R.drawable.shadia));
        singer.add(new Song(getString(R.string.mohamed_abdel_wahab), R.drawable.mohammed_abdel_wahab));
        singer.add(new Song(getString(R.string.najat_al_saghira), R.drawable.najat_al_saghira));
        singer.add(new Song(getString(R.string.saad_abdel_wahab), R.drawable.saad_abdel_wahab));
        singer.add(new Song(getString(R.string.sabah), R.drawable.sabah));
        singer.add(new Song(getString(R.string.farid_al_atrash), R.drawable.farid_al_atrash));
        singer.add(new Song(getString(R.string.asmahan), R.drawable.asmahan));
        singer.add(new Song(getString(R.string.leila_mourad), R.drawable.leila_mourad));
        singer.add(new Song(getString(R.string.soad_mohammed), R.drawable.soad_mohammed));
        singer.add(new Song(getString(R.string.mohamed_abd_elmotelb), R.drawable.mohamed_adb_elmotelb));
        singer.add(new Song(getString(R.string.sayed_mekawy), R.drawable.sayed_mekawy));
        singer.add(new Song(getString(R.string.mohamed_roshdy), R.drawable.mohamed_roshdy));
        singer.add(new Song(getString(R.string.mohamed_kandil), R.drawable.mohamed_kandil));
        singer.add(new Song(getString(R.string.mohamed_fawzy), R.drawable.mohamed_fawzy));

        CustomAdapter adapter = new CustomAdapter(this, singer);

        ListView listView = findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this, SongList.class);
                songList = new ArrayList<>();
                if (singer.get(position).getmDefaultArtist().equals(getString(R.string.umm_kulthum))) {
                    songList.add(getString(R.string.amal_hayati));
                    songList.add(getString(R.string.ana_f_entezarak));
                    songList.add(getString(R.string.al_atlal));
                    songList.add(getString(R.string.enta_omri));
                    songList.add(getString(R.string.esaal_rohak));
                    songList.add(getString(R.string.el_hobb_keda));
                    songList.add(getString(R.string.siret_el_hobb));
                    songList.add(getString(R.string.rubaiyat_al_khayyam));
                    songList.add(getString(R.string.lessa_faker));
                    songList.add(getString(R.string.lel_sabr_hodood));
                    songList.add(getString(R.string.leilet_hobb));
                    songList.add(getString(R.string.holl_el_ahebba));
                    songList.add(getString(R.string.howwa_sahih_el_hawa_ghallab));
                    songList.add(getString(R.string.hobb_eih));
                    songList.add(getString(R.string.hazihi_laylati));
                    songList.add(getString(R.string.hayyart_qalbi));
                    songList.add(getString(R.string.hasibak_lel_zaman));
                    songList.add(getString(R.string.hagartak));
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                    intent.putExtra(MyConstants.imageKey, image);
                    intent.putExtra(MyConstants.artistKey, getString(R.string.umm_kulthum));
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals(getString(R.string.abdelhalim_hafez))) {
                    songList.add(getString(R.string.zay_el_hawa));
                    songList.add(getString(R.string.ahwak));
                    songList.add(getString(R.string.gana_el_hawa));
                    songList.add(getString(R.string.sawah));
                    songList.add(getString(R.string.mawood));
                    songList.add(getString(R.string.safini_marra));
                    songList.add(getString(R.string.ana_lek_ala_toul));
                    songList.add(getString(R.string.zalamoh));
                    songList.add(getString(R.string.haga_ghariba));
                    songList.add(getString(R.string.last_adry));
                    songList.add(getString(R.string.hobak_nar));
                    songList.add(getString(R.string.asmar_ya_asmarani));
                    songList.add(getString(R.string.habebaty_man_takon));
                    songList.add(getString(R.string.qareet_al_fengan));
                    songList.add(getString(R.string.resala_men_taht_el_maa));
                    songList.add(getString(R.string.al_toba));
                    songList.add(getString(R.string.ala_qad_el_shouq));
                    songList.add(getString(R.string.fatet_ganbena));
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                    intent.putExtra(MyConstants.imageKey, image);
                    intent.putExtra(MyConstants.artistKey, getString(R.string.abdelhalim_hafez));
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals(getString(R.string.shadia))) {
                    songList.add(getString(R.string.en_rah_menek_ya_ain));
                    songList.add(getString(R.string.ah_ya_smarany_loun));
                    songList.add(getString(R.string.wehiat_eineik));
                    songList.add(getString(R.string.khodny_maak));
                    songList.add(getString(R.string.sona));
                    songList.add(getString(R.string.ya_habebty_ya_masr));
                    songList.add(getString(R.string.shebakna_satairoh));
                    songList.add(getString(R.string.belhadawa));
                    songList.add(getString(R.string.el_telephon));
                    songList.add(getString(R.string.ya_alby_sebak));
                    songList.add(getString(R.string.diblit_al_khoutouba));
                    songList.add(getString(R.string.seed_el_habaib));
                    songList.add(getString(R.string.akher_layela));
                    songList.add(getString(R.string.fouk_ya_alby));
                    songList.add(getString(R.string.al_shams_banit));
                    songList.add(getString(R.string.ah_ya_lamouny));
                    songList.add(getString(R.string.abyad_ya_ward));
                    songList.add(getString(R.string.mesh_oltekal_ya_alby));
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                    intent.putExtra(MyConstants.imageKey, image);
                    intent.putExtra(MyConstants.artistKey, getString(R.string.shadia));
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals(getString(R.string.mohamed_abdel_wahab))) {
                    songList.add(getString(R.string.msafer));
                    songList.add(getString(R.string.gafnouhou));
                    songList.add(getString(R.string.balash_tebosny));
                    songList.add(getString(R.string.ya_donia_ya_gharamy));
                    songList.add(getString(R.string.madnak));
                    songList.add(getString(R.string.ya_wabour));
                    songList.add(getString(R.string.kan_agmal_yom));
                    songList.add(getString(R.string.msafer_wahdak));
                    songList.add(getString(R.string.hob_el_watan));
                    songList.add(getString(R.string.ennahr_el_khaled));
                    songList.add(getString(R.string.el_karnak));
                    songList.add(getString(R.string.ya_wardet_el_hob));
                    songList.add(getString(R.string.hakem_oyon));
                    songList.add(getString(R.string.han_el_wed));
                    songList.add(getString(R.string.al_gondool));
                    songList.add(getString(R.string.hayaty_enta));
                    songList.add(getString(R.string.men_gheir_leh));
                    songList.add(getString(R.string.la_mush_ana_elli_abki));
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                    intent.putExtra(MyConstants.imageKey, image);
                    intent.putExtra(MyConstants.artistKey, getString(R.string.mohamed_abdel_wahab));
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals(getString(R.string.najat_al_saghira))) {
                    songList.add(getString(R.string.el_arieb_menk));
                    songList.add(getString(R.string.ana_bashaa_el_bahr));
                    songList.add(getString(R.string.ana_bastanak));
                    songList.add(getString(R.string.ettir_el_messafer));
                    songList.add(getString(R.string.saal_fi));
                    songList.add(getString(R.string.bahlam_maak));
                    songList.add(getString(R.string.kol_fen_w_fen));
                    songList.add(getString(R.string.law_ytoll_el_boed));
                    songList.add(getString(R.string.halawet_el_hob));
                    songList.add(getString(R.string.ayazon));
                    songList.add(getString(R.string.la_tantaked_khajali));
                    songList.add(getString(R.string.enta_enta));
                    songList.add(getString(R.string.ayoun_el_alb));
                    songList.add(getString(R.string.sahran_ya_amar));
                    songList.add(getString(R.string.wahdiah));
                    songList.add(getString(R.string.saat_ma_bachoufak_ganbi));
                    songList.add(getString(R.string.fe_west_el_tareek));
                    songList.add(getString(R.string.leh_khaletny_ahebak));
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                    intent.putExtra(MyConstants.imageKey, image);
                    intent.putExtra(MyConstants.artistKey, getString(R.string.najat_al_saghira));
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals(getString(R.string.saad_abdel_wahab))) {
                    songList.add(getString(R.string.el_donia_risha));
                    songList.add(getString(R.string.fil_leil_lama_khili));
                    songList.add(getString(R.string.elyoumein_dhoul));
                    songList.add(getString(R.string.ala_fein_wakhedni_eneik));
                    songList.add(getString(R.string.enta_wei_yaya_weil_hana_maaya));
                    songList.add(getString(R.string.ah_men_habibi));
                    songList.add(getString(R.string.fein_ganet_ahlamy));
                    songList.add(getString(R.string.el_shabab_weil_roh));
                    songList.add(getString(R.string.ehgerni_shawayashwaya));
                    songList.add(getString(R.string.shababak_enta_wei_eyounak_enta));
                    songList.add(getString(R.string.albi_el_asy));
                    songList.add(getString(R.string.men_khatwa_lei_khatwa));
                    songList.add(getString(R.string.helwein_kida_leih_teemin_kida_leih));
                    songList.add(getString(R.string.ma_betessalsh_leih));
                    songList.add(getString(R.string.el_yomein_dol_alby_malo));
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                    intent.putExtra(MyConstants.imageKey, image);
                    intent.putExtra(MyConstants.artistKey, getString(R.string.saad_abdel_wahab));
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals(getString(R.string.sabah))) {
                    songList.add(getString(R.string.yana_yana));
                    songList.add(getString(R.string.saat_saat));
                    songList.add(getString(R.string.zay_el_assal));
                    songList.add(getString(R.string.ana_hena));
                    songList.add(getString(R.string.ya_dalaa_dalaa));
                    songList.add(getString(R.string.el_helwa));
                    songList.add(getString(R.string.sho_esmak));
                    songList.add(getString(R.string.balash_ya_alby));
                    songList.add(getString(R.string.aashka_we_meskina));
                    songList.add(getString(R.string.amourti_el_helwa));
                    songList.add(getString(R.string.el_helo_leh_ta2lan));
                    songList.add(getString(R.string.el_donya_ehlawet_eddami));
                    songList.add(getString(R.string.el_dawama));
                    songList.add(getString(R.string.jani_we_talab_el_samah));
                    songList.add(getString(R.string.habibat_omaha));
                    songList.add(getString(R.string.ala_einy));
                    songList.add(getString(R.string.hona_el_qahera));
                    songList.add(getString(R.string.ya_msafer));
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                    intent.putExtra(MyConstants.imageKey, image);
                    intent.putExtra(MyConstants.artistKey, getString(R.string.sabah));
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals(getString(R.string.farid_al_atrash))) {
                    songList.add(getString(R.string.hebbina_hebbina));
                    songList.add(getString(R.string.gamil_gamal));
                    songList.add(getString(R.string.noura_ya_noura));
                    songList.add(getString(R.string.ya_zahratan_fi_khayali));
                    songList.add(getString(R.string.ya_gamil_ya_gamil));
                    songList.add(getString(R.string.wayak_wayak));
                    songList.add(getString(R.string.hekayet_gharami));
                    songList.add(getString(R.string.ya_ritni_tir));
                    songList.add(getString(R.string.zaman_ya_hob));
                    songList.add(getString(R.string.awel_hamsa));
                    songList.add(getString(R.string.adnaytani_bil_hajr));
                    songList.add(getString(R.string.daimen_maak));
                    songList.add(getString(R.string.esma_maktouba));
                    songList.add(getString(R.string.manhermsh_el_omr));
                    songList.add(getString(R.string.ismae_lamma_aoullak));
                    songList.add(getString(R.string.bahibbak_mahma_alo_annak));
                    songList.add(getString(R.string.ya_habibi_tal_ghetabak));
                    songList.add(getString(R.string.ghali_ya_bouy));
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                    intent.putExtra(MyConstants.imageKey, image);
                    intent.putExtra(MyConstants.artistKey, getString(R.string.farid_al_atrash));
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals(getString(R.string.asmahan))) {
                    songList.add(getString(R.string.ya_habibi_taala));
                    songList.add(getString(R.string.ya_touyour));
                    songList.add(getString(R.string.yalli_hawak));
                    songList.add(getString(R.string.ahwa));
                    songList.add(getString(R.string.ya_habibi_taala_elhaani));
                    songList.add(getString(R.string.dakhalti_marrah));
                    songList.add(getString(R.string.ya_min_yeqhol_ahwa));
                    songList.add(getString(R.string.layta_lel_barrak));
                    songList.add(getString(R.string.ya_dirati));
                    songList.add(getString(R.string.elward));
                    songList.add(getString(R.string.askiniha));
                    songList.add(getString(R.string.ya_layali_elbichar));
                    songList.add(getString(R.string.emta_tioud));
                    songList.add(getString(R.string.konti_elamani));
                    songList.add(getString(R.string.elouyoun));
                    songList.add(getString(R.string.emta_hateraf));
                    songList.add(getString(R.string.layali_elouns));
                    songList.add(getString(R.string.ayoha_naimo));
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                    intent.putExtra(MyConstants.imageKey, image);
                    intent.putExtra(MyConstants.artistKey, getString(R.string.asmahan));
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals(getString(R.string.leila_mourad))) {
                    songList.add(getString(R.string.ana_alby_dalily));
                    songList.add(getString(R.string.esaal_alaia));
                    songList.add(getString(R.string.aini_bitref));
                    songList.add(getString(R.string.ana_zay_mana));
                    songList.add(getString(R.string.sanatin_waan_ahayil_fik));
                    songList.add(getString(R.string.el_dounia_ghenoua));
                    songList.add(getString(R.string.etlob_enaya));
                    songList.add(getString(R.string.rah_el_hawa));
                    songList.add(getString(R.string.malich_amal));
                    songList.add(getString(R.string.yalla_taala_awam));
                    songList.add(getString(R.string.hayana_leh));
                    songList.add(getString(R.string.akteblak_gawabat));
                    songList.add(getString(R.string.abgad_hawaz));
                    songList.add(getString(R.string.ama_ahibak));
                    songList.add(getString(R.string.leh_khaletni_ahebak));
                    songList.add(getString(R.string.raydak));
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                    intent.putExtra(MyConstants.imageKey, image);
                    intent.putExtra(MyConstants.artistKey, getString(R.string.leila_mourad));
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals(getString(R.string.soad_mohammed))) {
                    songList.add(getString(R.string.wahashtini));
                    songList.add(getString(R.string.mazlouma));
                    songList.add(getString(R.string.rah_el_hob));
                    songList.add(getString(R.string.men_gheri_hob));
                    songList.add(getString(R.string.ashreqy_shams_el_hoda));
                    songList.add(getString(R.string.ana_haweit));
                    songList.add(getString(R.string.achouq_ya_bouy));
                    songList.add(getString(R.string.kam_nashd_el_mokhtar));
                    songList.add(getString(R.string.hasbaho_allah_maah));
                    songList.add(getString(R.string.wa_gareeha));
                    songList.add(getString(R.string.nehayet_el_hekaya));
                    songList.add(getString(R.string.ya_habeibty_ya_ghalia));
                    songList.add(getString(R.string.salam_wy_kallam));
                    songList.add(getString(R.string.eddi_el_haya_forssa));
                    songList.add(getString(R.string.shyi_ghareeb));
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                    intent.putExtra(MyConstants.imageKey, image);
                    intent.putExtra(MyConstants.artistKey, getString(R.string.soad_mohammed));
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals(R.string.mohamed_abd_elmotelb)) {
                    songList.add(getString(R.string.bayaa_elhawa));
                    songList.add(getString(R.string.elsabt_faat));
                    songList.add(getString(R.string.ahll_elmhaba));
                    songList.add(getString(R.string.ya_abo_eleeyon_elsod));
                    songList.add(getString(R.string.ya_ahl_elbalad));
                    songList.add(getString(R.string.betsleny_bahebk_leh));
                    songList.add(getString(R.string.habetk_wbhebak));
                    songList.add(getString(R.string.atshan_ya_sabaya));
                    songList.add(getString(R.string.wana_maly));
                    songList.add(getString(R.string.teslm_eden_eleshtra));
                    songList.add(getString(R.string.anta_mesh_andk_habib));
                    songList.add(getString(R.string.ya_byene_wana_share));
                    songList.add(getString(R.string.wadaa_hawak));
                    songList.add(getString(R.string.fe_alby_gram));
                    songList.add(getString(R.string.elmrtahen_fe_elhob));
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                    intent.putExtra(MyConstants.imageKey, image);
                    intent.putExtra(MyConstants.artistKey, getString(R.string.mohamed_abd_elmotelb));
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals(getString(R.string.sayed_mekawy))) {
                    songList.add(getString(R.string.ya_salat_el_zein));
                    songList.add(getString(R.string.el_ward_gamil));
                    songList.add(getString(R.string.esha_ya_nayem));
                    songList.add(getString(R.string.helween_men_yomna));
                    songList.add(getString(R.string.esaal_marra_aleya));
                    songList.add(getString(R.string.habibi_yeseed_awaato));
                    songList.add(getString(R.string.ya_helawet_el_donia));
                    songList.add(getString(R.string.el_ayam_el_helwa));
                    songList.add(getString(R.string.yalli_tehen_el_fan));
                    songList.add(getString(R.string.balash_moanda));
                    songList.add(getString(R.string.shawerli));
                    songList.add(getString(R.string.khally_shwaya_aliek));
                    songList.add(getString(R.string.awaaty_betehlaw));
                    songList.add(getString(R.string.laylt_imbarih));
                    songList.add(getString(R.string.keda_yehlaw_el_kalam));
                    songList.add(getString(R.string.agaby));
                    songList.add(getString(R.string.ya_nas_la_mesh_keda));
                    songList.add(getString(R.string.mesha_ketir_ala_alby));
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                    intent.putExtra(MyConstants.imageKey, image);
                    intent.putExtra(MyConstants.artistKey, getString(R.string.sayed_mekawy));
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals(getString(R.string.mohamed_roshdy))) {
                    songList.add(getString(R.string.tayer_ya_hawa));
                    songList.add(getString(R.string.meta_ashofak));
                    songList.add(getString(R.string.enta_meen));
                    songList.add(getString(R.string.kaeb_el_ghazal));
                    songList.add(getString(R.string.ya_amar_eskandarany));
                    songList.add(getString(R.string.ya_bareket_ramadan_khaleeky));
                    songList.add(getString(R.string.al_ramla));
                    songList.add(getString(R.string.akhtarlak_sahab));
                    songList.add(getString(R.string.qtr_el_hatat));
                    songList.add(getString(R.string.shaka_omry));
                    songList.add(getString(R.string.khalek_ya_alby_tayab));
                    songList.add(getString(R.string.moghram_sababa));
                    songList.add(getString(R.string.al_habayab_al_ghadareen));
                    songList.add(getString(R.string.howa_fy_aah));
                    songList.add(getString(R.string.argook_habeby));
                    songList.add(getString(R.string.biaa_el_kanadel));
                    songList.add(getString(R.string.damit_lmin));
                    songList.add(getString(R.string.mazoon_elbalad));
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                    intent.putExtra(MyConstants.imageKey, image);
                    intent.putExtra(MyConstants.artistKey, getString(R.string.mohamed_roshdy));
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals(getString(R.string.mohamed_kandil))) {
                    songList.add(getString(R.string.talat_salamat));
                    songList.add(getString(R.string.abou_samra));
                    songList.add(getString(R.string.en_getna_ya_gamil));
                    songList.add(getString(R.string.el_helw_abo_shama));
                    songList.add(getString(R.string.hawen_ya_mehawen));
                    songList.add(getString(R.string.gamil_wasmar));
                    songList.add(getString(R.string.ya_helw_sabah));
                    songList.add(getString(R.string.khalek_maanesna));
                    songList.add(getString(R.string.yally_maaya));
                    songList.add(getString(R.string.wehda));
                    songList.add(getString(R.string.kobry_abou_el_3ela));
                    songList.add(getString(R.string.fakartony));
                    songList.add(getString(R.string.ololy_a3mel_eh));
                    songList.add(getString(R.string.been_shaten_we_maya));
                    songList.add(getString(R.string.mashy_kalamk));
                    songList.add(getString(R.string.inshallah_ma3dmak));
                    songList.add(getString(R.string.ya_labsa_el_masha_allah));
                    songList.add(getString(R.string.ana_we_habibiy));
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                    intent.putExtra(MyConstants.imageKey, image);
                    intent.putExtra(MyConstants.artistKey, getString(R.string.mohamed_kandil));
                    startActivity(intent);
                }

                if (singer.get(position).getmDefaultArtist().equals(getString(R.string.mohamed_fawzy))) {
                    songList.add(getString(R.string.mal_el_amar_malo));
                    songList.add(getString(R.string.tamly_fe_alby));
                    songList.add(getString(R.string.hato_el_fawanees));
                    songList.add(getString(R.string.teer_bena_ya_alby));
                    songList.add(getString(R.string.dary_el3youn));
                    songList.add(getString(R.string.kalmny_we_tameny));
                    songList.add(getString(R.string.mama_zamanha_gaya));
                    songList.add(getString(R.string.ya_welad_baldna));
                    songList.add(getString(R.string.kan_badri_alik));
                    songList.add(getString(R.string.ya_bakhtat_ya));
                    songList.add(getString(R.string.ya_salam));
                    songList.add(getString(R.string.fatafet_el_sokar));
                    songList.add(getString(R.string.ay_wallah));
                    songList.add(getString(R.string.rah_rewhacheni));
                    int image = singer.get(position).getmImageResourceId();
                    intent.putStringArrayListExtra(MyConstants.songListKey, songList);
                    intent.putExtra(MyConstants.imageKey, image);
                    intent.putExtra(MyConstants.artistKey, getString(R.string.mohamed_fawzy));
                    startActivity(intent);
                }
            }
        });

    }
}
