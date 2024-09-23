package com.code.camp.veera.prototype.pattern;

public class ProtoTypePatternMainClass {
    public static void main(String[] args) {
        ProfessionCache.loadProfessionCache();

        Profession docProfession = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession);

        Profession engProfession = ProfessionCache.getCloneNewProfession(2);
        System.out.println(engProfession);

        Profession teacherProfession = ProfessionCache.getCloneNewProfession(3);
        System.out.println(teacherProfession);

        Profession docProfession2 = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession2);
    }
}
