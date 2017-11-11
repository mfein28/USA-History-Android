package com.us.mattfein.ushistory;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Presidents extends Fragment implements View.OnClickListener {


    public Presidents() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_presidents, container, false);
        animateScroll(v);
        cardListeners(v);
        return v;
    }

    private void animateScroll(View v){
        ScrollView scroll = (ScrollView) v.findViewById(R.id.scroll);
        Animation slidedown = AnimationUtils.loadAnimation(getActivity(), R.anim.slidedown);
        scroll.startAnimation(slidedown);
    }

    private void dissapearScroll() {
        ScrollView scroll =(ScrollView) getView().findViewById(R.id.scroll);
        Animation slideup = AnimationUtils.loadAnimation(getActivity(), R.anim.slideup);
        scroll.startAnimation(slideup);
    }

    private void cardListeners(View v) {
        CardView gwcard = (CardView) v.findViewById(R.id.gwCard);
        CardView jacard = (CardView) v.findViewById(R.id.johnA);
        CardView tjcard = (CardView) v.findViewById(R.id.tJ);
        CardView jmacard = (CardView) v.findViewById(R.id.jamesMad);
        CardView jmocard = (CardView) v.findViewById(R.id.Jmo);
        CardView jqacard = (CardView) v.findViewById(R.id.jqa);
        CardView Ajackcard = (CardView) v.findViewById(R.id.Aj);
        CardView mvbcard = (CardView) v.findViewById(R.id.mvb);
        CardView whhcard = (CardView) v.findViewById(R.id.whh);
        CardView jtcard = (CardView) v.findViewById(R.id.jt);
        CardView jkpcard = (CardView) v.findViewById(R.id.jkp);
        CardView ztcard = (CardView) v.findViewById(R.id.zt);
        CardView mfcard = (CardView) v.findViewById(R.id.mf);
        CardView fpcard = (CardView) v.findViewById(R.id.fp);
        CardView jbcard = (CardView) v.findViewById(R.id.jb);
        CardView alcard = (CardView) v.findViewById(R.id.al);
        CardView AJohncard = (CardView) v.findViewById(R.id.Aj2);
        CardView ugcard = (CardView) v.findViewById(R.id.ug);
        CardView rbhcard = (CardView) v.findViewById(R.id.rbh);
        CardView jgcard = (CardView) v.findViewById(R.id.jg);
        CardView cacard = (CardView) v.findViewById(R.id.ca);
        CardView gccard = (CardView) v.findViewById(R.id.gc);
        CardView bhcard = (CardView) v.findViewById(R.id.bh);
        CardView wmcard = (CardView) v.findViewById(R.id.wm);
        CardView trcard = (CardView) v.findViewById(R.id.tr);
        CardView wtcard = (CardView) v.findViewById(R.id.wt);
        CardView wwcard = (CardView) v.findViewById(R.id.ww);
        CardView whcard = (CardView) v.findViewById(R.id.wh);
        CardView cccard = (CardView) v.findViewById(R.id.cc);
        CardView hhcard = (CardView) v.findViewById(R.id.hh);
        CardView fdrcard = (CardView) v.findViewById(R.id.fdr);
        CardView htcard = (CardView) v.findViewById(R.id.ht);
        CardView decard = (CardView) v.findViewById(R.id.de);
        CardView jfkcard = (CardView) v.findViewById(R.id.jfk);
        CardView lbjcard = (CardView) v.findViewById(R.id.lbj);
        CardView rncard = (CardView) v.findViewById(R.id.rn);
        CardView gfcard = (CardView) v.findViewById(R.id.gf);
        CardView jccard = (CardView) v.findViewById(R.id.jc);
        CardView rrcard = (CardView) v.findViewById(R.id.rr);
        CardView ghbcard = (CardView) v.findViewById(R.id.ghb);
        CardView bccard = (CardView) v.findViewById(R.id.bc);
        CardView gwbcard = (CardView) v.findViewById(R.id.gwb);
        CardView bocard = (CardView) v.findViewById(R.id.bo);
        CardView dtcard = (CardView) v.findViewById(R.id.dt);
        gwcard.setOnClickListener(this);
        jacard.setOnClickListener(this);
        tjcard.setOnClickListener(this);
        jmocard.setOnClickListener(this);
        jmacard.setOnClickListener(this);
        jqacard.setOnClickListener(this);
        Ajackcard.setOnClickListener(this);
        mvbcard.setOnClickListener(this);
        whhcard.setOnClickListener(this);
        jtcard.setOnClickListener(this);
        jkpcard.setOnClickListener(this);
        jmacard.setOnClickListener(this);
        ztcard.setOnClickListener(this);
        mfcard.setOnClickListener(this);
        fpcard.setOnClickListener(this);
        jbcard.setOnClickListener(this);
        alcard.setOnClickListener(this);
        AJohncard.setOnClickListener(this);
        ugcard.setOnClickListener(this);
        rbhcard.setOnClickListener(this);
        jgcard.setOnClickListener(this);
        cacard.setOnClickListener(this);
        gccard.setOnClickListener(this);
        bhcard.setOnClickListener(this);
        wmcard.setOnClickListener(this);
        trcard.setOnClickListener(this);
        wtcard.setOnClickListener(this);
        wwcard.setOnClickListener(this);
        whcard.setOnClickListener(this);
        cccard.setOnClickListener(this);
        hhcard.setOnClickListener(this);
        fdrcard.setOnClickListener(this);
        htcard.setOnClickListener(this);
        decard.setOnClickListener(this);
        jfkcard.setOnClickListener(this);
        lbjcard.setOnClickListener(this);
        rncard.setOnClickListener(this);
        gfcard.setOnClickListener(this);
        jccard.setOnClickListener(this);
        rrcard.setOnClickListener(this);
        ghbcard.setOnClickListener(this);
        bccard.setOnClickListener(this);
        gwbcard.setOnClickListener(this);
        bocard.setOnClickListener(this);
        dtcard.setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.gwCard:
                animategw();
                dissapearScroll();
                Intent gw = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.GW.class);
                startActivity(gw);
                break;
            case R.id.johnA:
                animateja();
                dissapearScroll();
                Intent ja = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.JA.class);
                startActivity(ja);
                break;
            case R.id.tJ:
                animatetj();
                dissapearScroll();
                Intent tj = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.TJ.class);
                startActivity(tj);
                break;

            case R.id.jamesMad:
                animateJma();
                dissapearScroll();
                Intent jma = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.JMA.class);
                startActivity(jma);
                break;

            case R.id.Jmo:
                animatejmo();
                dissapearScroll();
                Intent jmo = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.JMO.class);
                startActivity(jmo);
                break;
            
            case R.id.jqa:
                animatejqa();
                dissapearScroll();
                Intent jqa = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.JQA.class);
                startActivity(jqa);
                break;
            
            case R.id.Aj:
                animateaj();
                dissapearScroll();
                Intent aj = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.AJ.class);
                startActivity(aj);
                break;
            
            case R.id.mvb:
                animatemvb();
                dissapearScroll();
                Intent mvb = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.MVB.class);
                startActivity(mvb);
                break;
            
            case R.id.whh:
                animatewhh();
                dissapearScroll();
                Intent whh = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.WHH.class);
                startActivity(whh);
                break;
            
            case R.id.jt:
                animatejt();
                dissapearScroll();
                Intent jt = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.JT.class);
                startActivity(jt);
                break;
            
            case R.id.jkp:
                animatejkp();
                dissapearScroll();
                Intent jkp = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.JKP.class);
                startActivity(jkp);
                break;
           
            case R.id.zt:
                animatezt();
                dissapearScroll();
                Intent zt = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.ZT.class);
                startActivity(zt);
                break;
          
            case R.id.mf:
                animatemf();
                dissapearScroll();
                Intent mf = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.MF.class);
                startActivity(mf);
                break;
            
            case R.id.fp:
                animatefp();
                dissapearScroll();
                Intent fp = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.FP.class);
                startActivity(fp);
                break;
            
            case R.id.jb:
                animatejb();
                dissapearScroll();
                Intent jb = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.JB.class);
                startActivity(jb);
                break;
            
            case R.id.al:
                animateal();
                dissapearScroll();
                Intent al = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.AL.class);
                startActivity(al);
                break;
            
            case R.id.Aj2:
                animateAj2();
                dissapearScroll();
                Intent aj2 = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.Ajo.class);
                startActivity(aj2);
                break;

            case R.id.ug:
                animateug();
                dissapearScroll();
                Intent ug = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.UG.class);
                startActivity(ug);
                break;

            case R.id.rbh:
                animaterbh();
                dissapearScroll();
                Intent rbh = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.RBH.class);
                startActivity(rbh);

                break;
            
            case R.id.jg:
                animatejg();
                dissapearScroll();
                Intent jg = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.JG.class);
                startActivity(jg);
                break;
           
            case R.id.ca:
                animateca();
                dissapearScroll();
                Intent ca = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.CA.class);
                startActivity(ca);
                break;
            
            case R.id.gc:
                animategc();
                dissapearScroll();
                Intent gc = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.GC.class);
                startActivity(gc);
                break;

            case R.id.bh:
                animategc();
                dissapearScroll();
                Intent bh = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.BH.class);
                startActivity(bh);
                break;
            
            case R.id.wm:
                animatewm();
                dissapearScroll();
                Intent wm = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.WM.class);
                startActivity(wm);
                break;
            
            case R.id.tr:
                animatetr();
                dissapearScroll();
                Intent tr = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.TR.class);
                startActivity(tr);
                break;
            case R.id.wt:
                animatewt();
                dissapearScroll();
                Intent wt = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.WT.class);
                startActivity(wt);
                break;
            case R.id.ww:
                animateww();
                dissapearScroll();
                Intent ww = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.WW.class);
                startActivity(ww);
                break;
            case R.id.wh:
                animatewh();
                dissapearScroll();
                Intent wh = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.WH.class);
                startActivity(wh);
                break;
            case R.id.cc:
                animatecc();
                dissapearScroll();
                Intent cc = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.CC.class);
                startActivity(cc);
                break;
            case R.id.hh:
                animatehh();
                dissapearScroll();
                Intent hh = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.HH.class);
                startActivity(hh);
                break;
           
            case R.id.fdr:
                animatefdr();
                dissapearScroll();
                Intent fdr = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.FDR.class);
                startActivity(fdr);
                break;
           
            case R.id.ht:
                animateht();
                dissapearScroll();
                Intent ht = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.HT.class);
                startActivity(ht);
                break;
            
            case R.id.de:
                animatede();
                dissapearScroll();
                Intent de = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.DE.class);
                startActivity(de);
                break;
            case R.id.jfk:
                animatejfk();
                dissapearScroll();
                Intent jfk = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.JFK.class);
                startActivity(jfk);
                break;
            case R.id.lbj:
                animatelbj();
                dissapearScroll();
                Intent lbj = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.LBJ.class);
                startActivity(lbj);
                break;
           
            case R.id.rn:
                animatern();
                dissapearScroll();
                Intent rn = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.RN.class);
                startActivity(rn);
                break;
           
            case R.id.gf:
                animategf();
                dissapearScroll();
                Intent gf = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.GF.class);
                startActivity(gf);
                break;
            case R.id.jc:
                animatejc();
                dissapearScroll();
                Intent jc = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.JC.class);
                startActivity(jc);
                break;
          
            case R.id.rr:
                animaterr();
                dissapearScroll();
                Intent rr = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.RR.class);
                startActivity(rr);
                break;
         
            case R.id.ghb:
                animateghb();
                dissapearScroll();
                Intent ghb = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.GHB.class);
                startActivity(ghb);
                break;

            case R.id.bc:
                animatebc();
                dissapearScroll();
                Intent bc = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.BC.class);
                startActivity(bc);
                break;

            case R.id.gwb:
                animategwb();
                dissapearScroll();
                Intent gwb = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.GWB.class);
                startActivity(gwb);
                break;

            case R.id.bo:
                animatebo();
                dissapearScroll();
                Intent bo = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.BO.class);
                startActivity(bo);
                break;
            
            case R.id.dt:
                animatedt();
                dissapearScroll();
                Intent dt = new Intent(getActivity(), com.us.mattfein.ushistory.PresidentsPack.DT.class);
                startActivity(dt);
                break;
        }
    }


    private void animategw() {
        CardView gwcard = (CardView) getView().findViewById(R.id.gwCard);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        gwcard.startAnimation(cardup);
    }
    private void animatewt(){
        CardView wtcard = (CardView) getView().findViewById(R.id.wt);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        wtcard.startAnimation(cardup);
    }
    private void animateww(){
        CardView wwCard = (CardView) getView().findViewById(R.id.ww);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        wwCard.startAnimation(cardup);
    }
    private void animatedt(){
        CardView dtCard = (CardView) getView().findViewById(R.id.ww);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        dtCard.startAnimation(cardup);
    }
    private void animatebo(){
        CardView bocard = (CardView) getView().findViewById(R.id.bo);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        bocard.startAnimation(cardup);
    }
    private void animategwb(){
        CardView gwbcard = (CardView) getView().findViewById(R.id.gwb);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        gwbcard.startAnimation(cardup);

    }
    private void animatebc(){
        CardView bccard = (CardView) getView().findViewById(R.id.bc);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        bccard.startAnimation(cardup);
    }
    private void animateghb(){
        CardView ghbcard = (CardView) getView().findViewById(R.id.ghb);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        ghbcard.startAnimation(cardup);
    }
    private void animaterr(){
        CardView rrcard = (CardView) getView().findViewById(R.id.rr);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        rrcard.startAnimation(cardup);
    }
    private void animatejc(){
        CardView jccard = (CardView) getView().findViewById(R.id.jc);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        jccard.startAnimation(cardup);

    }
    private void animategf(){
        CardView gfcard = (CardView) getView().findViewById(R.id.gf);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        gfcard.startAnimation(cardup);
    }
    private void animatern(){
        CardView rncard = (CardView) getView().findViewById(R.id.rn);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        rncard.startAnimation(cardup);
    }
    private void animatelbj(){
        CardView lbjcard = (CardView) getView().findViewById(R.id.lbj);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        lbjcard.startAnimation(cardup);

    }
    private void animatejfk(){
        CardView jfkcard = (CardView) getView().findViewById(R.id.jfk);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        jfkcard.startAnimation(cardup);

    }
    private void animatede(){
        CardView ikecard = (CardView) getView().findViewById(R.id.de);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        ikecard.startAnimation(cardup);

    }
    private void animateht(){
        CardView htcard = (CardView) getView().findViewById(R.id.ht);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        htcard.startAnimation(cardup);
    }
    private void animatefdr(){
        CardView fdrcard = (CardView) getView().findViewById(R.id.fdr);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        fdrcard.startAnimation(cardup);

    }
    private void animatehh(){
        CardView hhcard = (CardView) getView().findViewById(R.id.hh);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        hhcard.startAnimation(cardup);

    }
    private void animatetr(){
        CardView trcard = (CardView) getView().findViewById(R.id.tr);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        trcard.startAnimation(cardup);

    }
    private void animatewm(){
        CardView wmcard = (CardView) getView().findViewById(R.id.wm);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        wmcard.startAnimation(cardup);

    }
    private void animatecc(){
        CardView cccard = (CardView) getView().findViewById(R.id.cc);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        cccard.startAnimation(cardup);

    }
    private void animategc(){
        CardView gccard = (CardView) getView().findViewById(R.id.gc);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        gccard.startAnimation(cardup);

    }
    private void animateca(){
        CardView cacard = (CardView) getView().findViewById(R.id.ca);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        cacard.startAnimation(cardup);

    }
    private void animatejg() {
        CardView jgcard = (CardView) getView().findViewById(R.id.jg);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(), R.anim.cardup);
        jgcard.startAnimation(cardup);
    }
    private void animaterbh(){
        CardView bhcard = (CardView) getView().findViewById(R.id.bh);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        bhcard.startAnimation(cardup);

    }
    private void animateug(){
        CardView ugcard = (CardView) getView().findViewById(R.id.ug);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        ugcard.startAnimation(cardup);
    }
    private void animateAj2(){
        CardView aj2card = (CardView) getView().findViewById(R.id.Aj2);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        aj2card.startAnimation(cardup);

    }
    private void animateal(){
        CardView alcard = (CardView) getView().findViewById(R.id.al);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        alcard.startAnimation(cardup);

    }
    private void animatewh() {
        CardView whcard = (CardView) getView().findViewById(R.id.wh);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        whcard.startAnimation(cardup);
    }
    private void animatejb() {
        CardView jbcard = (CardView) getView().findViewById(R.id.jb);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        jbcard.startAnimation(cardup);
    }
    private void animatefp() {
        CardView fpcard = (CardView) getView().findViewById(R.id.fp);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        fpcard.startAnimation(cardup);
    }
    private void animatemf() {
        CardView mfcard = (CardView) getView().findViewById(R.id.mf);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        mfcard.startAnimation(cardup);
    }
    private void animatezt() {
        CardView ztcard = (CardView) getView().findViewById(R.id.zt);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        ztcard.startAnimation(cardup);
    }
    private void animatejkp() {
        CardView jkpcard = (CardView) getView().findViewById(R.id.jkp);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        jkpcard.startAnimation(cardup);
    }
    private void animatejt() {
        CardView jtcard = (CardView) getView().findViewById(R.id.jt);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        jtcard.startAnimation(cardup);
    }
    private void animatewhh() {
        CardView whhcard = (CardView) getView().findViewById(R.id.whh);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        whhcard.startAnimation(cardup);
    }
    private void animatemvb() {
        CardView mvbcard = (CardView) getView().findViewById(R.id.mvb);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        mvbcard.startAnimation(cardup);
    }
    private void animateaj() {
        CardView ajcard = (CardView) getView().findViewById(R.id.Aj);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        ajcard.startAnimation(cardup);

    }
    private void animatejqa() {
        CardView jqacard = (CardView) getView().findViewById(R.id.jqa);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        jqacard.startAnimation(cardup);
    }
    private void animatejmo() {
        CardView jmocard = (CardView) getView().findViewById(R.id.Jmo);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        jmocard.startAnimation(cardup);
    }
    private void animateJma(){
        CardView jmacard = (CardView) getView().findViewById(R.id.jamesMad);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        jmacard.startAnimation(cardup);
    }
    private void animatetj() {
        CardView tjcard = (CardView) getView().findViewById(R.id.tJ);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        tjcard.startAnimation(cardup);

    }
    private void animateja() {
        CardView jacard = (CardView) getView().findViewById(R.id.johnA);
        final Animation cardup = AnimationUtils.loadAnimation(getActivity(),R.anim.cardup);
        jacard.startAnimation(cardup);
    }

}
