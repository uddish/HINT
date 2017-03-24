package com.example.uddishverma22.hint;

/**
 * Created by mohitkumar on 24/03/17.
 */

public class POJO {

    int age;
    int gender; //male 1 female2
    int s_emp;//no 0 yes1
    int family_his;//no 0,yes 1
    int treatment;//no 0 yes 1
    int work_interfere;//sometimes 0,never 1,rarely 2,often 3,can't say 4
    int no_of_emp;//1-5 1,6-25 2,25-100 3,100-500 4,500 -1000 5, 1000 and above 6
    int remotework;//tes 1 no 0
    int tech_comp;//yes 1 no 0
    int benefits;//yes 0,no 1,don't know 2
    int seekhelp;//no 0,yes 1,don't know 2
    int anonymity;//no 0 yes 1 don't know 2;
    int leave;//dont know 0,somewhat easy 2,very easy 1,somewhat difficult 3,very difficult 4
    int mental_cons;//no 0,yes 1,maybe 2
    int phys_health;//no 0,yes 1,maybe 2
    int coworkers;//no 0,yes 1,some of them 2
    int superwisers;//no 0,yes 1,some of them 2
    int ment_interview;//no 0,yes 1,maybe 2
    int phys_health_i;//no 0,yes 1, maybe 2

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getS_emp() {
        return s_emp;
    }

    public void setS_emp(int s_emp) {
        this.s_emp = s_emp;
    }

    public int getFamily_his() {
        return family_his;
    }

    public void setFamily_his(int family_his) {
        this.family_his = family_his;
    }

    public int getTreatment() {
        return treatment;
    }

    public void setTreatment(int treatment) {
        this.treatment = treatment;
    }

    public int getWork_interfere() {
        return work_interfere;
    }

    public void setWork_interfere(int work_interfere) {
        this.work_interfere = work_interfere;
    }

    public int getNo_of_emp() {
        return no_of_emp;
    }

    public void setNo_of_emp(int no_of_emp) {
        this.no_of_emp = no_of_emp;
    }

    public int getRemotework() {
        return remotework;
    }

    public void setRemotework(int remotework) {
        this.remotework = remotework;
    }

    public int getTech_comp() {
        return tech_comp;
    }

    public void setTech_comp(int tech_comp) {
        this.tech_comp = tech_comp;
    }

    public int getBenefits() {
        return benefits;
    }

    public void setBenefits(int benefits) {
        this.benefits = benefits;
    }

    public int getSeekhelp() {
        return seekhelp;
    }

    public void setSeekhelp(int seekhelp) {
        this.seekhelp = seekhelp;
    }

    public int getAnonymity() {
        return anonymity;
    }

    public void setAnonymity(int anonymity) {
        this.anonymity = anonymity;
    }

    public int getLeave() {
        return leave;
    }

    public void setLeave(int leave) {
        this.leave = leave;
    }

    public int getMental_cons() {
        return mental_cons;
    }

    public void setMental_cons(int mental_cons) {
        this.mental_cons = mental_cons;
    }

    public int getPhys_health() {
        return phys_health;
    }

    public void setPhys_health(int phys_health) {
        this.phys_health = phys_health;
    }

    public int getCoworkers() {
        return coworkers;
    }

    public void setCoworkers(int coworkers) {
        this.coworkers = coworkers;
    }

    public int getSuperwisers() {
        return superwisers;
    }

    public void setSuperwisers(int superwisers) {
        this.superwisers = superwisers;
    }

    public int getMent_interview() {
        return ment_interview;
    }

    public void setMent_interview(int ment_interview) {
        this.ment_interview = ment_interview;
    }

    public int getPhys_health_i() {
        return phys_health_i;
    }

    public void setPhys_health_i(int phys_health_i) {
        this.phys_health_i = phys_health_i;
    }

    public POJO(int age, int gender, int s_emp, int family_his, int treatment, int work_interfere, int no_of_emp, int remotework, int tech_comp, int benefits, int seekhelp, int anonymity, int leave, int mental_cons, int phys_health, int coworkers, int superwisers, int ment_interview, int phys_health_i) {
        this.age = age;
        this.gender = gender;
        this.s_emp = s_emp;
        this.family_his = family_his;
        this.treatment = treatment;
        this.work_interfere = work_interfere;
        this.no_of_emp = no_of_emp;
        this.remotework = remotework;
        this.tech_comp = tech_comp;
        this.benefits = benefits;
        this.seekhelp = seekhelp;
        this.anonymity = anonymity;
        this.leave = leave;
        this.mental_cons = mental_cons;
        this.phys_health = phys_health;
        this.coworkers = coworkers;
        this.superwisers = superwisers;
        this.ment_interview = ment_interview;
        this.phys_health_i = phys_health_i;
    }
}
