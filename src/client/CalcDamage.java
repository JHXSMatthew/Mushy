package client;

/**
 *
 * @author MechAviv
 */

public class CalcDamage {
    private int nRndGenForCharacter, nRndGenForAura, nRndGenForPvP, nRndGenForMob, nRndForCheckDamageMiss,
                nRndForCheckDamageMissBak, nRndForMortalBlow, nRndForSummoned, nRndForMob;
    private boolean bKillingPointAddDam;
    private boolean bDarkSightAddDam;
    // tOldSuddenDeath
    
    public CalcDamage(int nRndGenForCharacter) {// only character gen for now
        this.nRndGenForCharacter = nRndGenForCharacter;
    }
    
    public int getnRndGenForCharacter() {
        return nRndGenForCharacter;
    }

    public void setnRndGenForCharacter(int nRndGenForCharacter) {
        this.nRndGenForCharacter = nRndGenForCharacter;
    }

    public int getnRndGenForAura() {
        return nRndGenForAura;
    }

    public void setnRndGenForAura(int nRndGenForAura) {
        this.nRndGenForAura = nRndGenForAura;
    }

    public int getnRndGenForPvP() {
        return nRndGenForPvP;
    }

    public void setnRndGenForPvP(int nRndGenForPvP) {
        this.nRndGenForPvP = nRndGenForPvP;
    }

    public int getnRndGenForMob() {
        return nRndGenForMob;
    }

    public void setnRndGenForMob(int nRndGenForMob) {
        this.nRndGenForMob = nRndGenForMob;
    }

    public int getnRndForCheckDamageMiss() {
        return nRndForCheckDamageMiss;
    }

    public void setnRndForCheckDamageMiss(int nRndForCheckDamageMiss) {
        this.nRndForCheckDamageMiss = nRndForCheckDamageMiss;
    }

    public int getnRndForCheckDamageMissBak() {
        return nRndForCheckDamageMissBak;
    }

    public void setnRndForCheckDamageMissBak(int nRndForCheckDamageMissBak) {
        this.nRndForCheckDamageMissBak = nRndForCheckDamageMissBak;
    }

    public int getnRndForMortalBlow() {
        return nRndForMortalBlow;
    }

    public void setnRndForMortalBlow(int nRndForMortalBlow) {
        this.nRndForMortalBlow = nRndForMortalBlow;
    }

    public int getnRndForSummoned() {
        return nRndForSummoned;
    }

    public void setnRndForSummoned(int nRndForSummoned) {
        this.nRndForSummoned = nRndForSummoned;
    }

    public int getnRndForMob() {
        return nRndForMob;
    }

    public void setnRndForMob(int nRndForMob) {
        this.nRndForMob = nRndForMob;
    }

    public boolean isbKillingPointAddDam() {
        return bKillingPointAddDam;
    }

    public void setbKillingPointAddDam(boolean bKillingPointAddDam) {
        this.bKillingPointAddDam = bKillingPointAddDam;
    }

    public boolean isbDarkSightAddDam() {
        return bDarkSightAddDam;
    }

    public void setbDarkSightAddDam(boolean bDarkSightAddDam) {
        this.bDarkSightAddDam = bDarkSightAddDam;
    }
    
}
