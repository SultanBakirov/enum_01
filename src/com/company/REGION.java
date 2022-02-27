package com.company;

public enum REGION {
    BATKEN("sonun zardarluu jer"),
    OSH("samsa"),
    DJALALABAD("AralanBap"),
    NARYN("toolu jer"),
    TALAS("ChatyrKol"),
    ISSYKKUL("Kol"),
    CHUY("Jerjemishter");

    private String ozgocholor;

    REGION(String ozgocholor) {
        this.ozgocholor = ozgocholor;
    }

    public String getOzgocholor() {
        return ozgocholor;
    }

    public void setOzgocholor(String ozgocholor) {
        this.ozgocholor = ozgocholor;
    }
}
