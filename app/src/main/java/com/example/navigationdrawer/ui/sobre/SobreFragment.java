package com.example.navigationdrawer.ui.sobre;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdrawer.R;

import mehdi.sakout.aboutpage.AboutPage;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {


    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String descricao = "A ATM consultoria tem como missão apoiar organizações que desejam o crescimento profissional...";


        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descricao)
                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br", "Envie um e-mail")
                .addWebsite("http://www.google.com/", "Acesse nosso site")
                .addGroup("Redes sociais")
                .addFacebook("facebook", "Facebook")
                .addInstagram("instagram", "Instagram")
                .addTwitter("twitter", "Twitter")
                .addYoutube("youtube","YouTube")




                .create();




        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_sobre, container, false);
    }

}
