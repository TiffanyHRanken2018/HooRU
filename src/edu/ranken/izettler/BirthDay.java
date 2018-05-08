package edu.ranken.izettler;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class BirthDay {
    //constants Astrological signs info
    static final String AQUARIUS = "Strengths: Progressive, original, independent, humanitarian\n" +
            "Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
            "Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
            "Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them";
    static final String ARIES = "Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\n" +
            "Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
            "Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports\n" +
            "Aries dislikes: Inactivity, delays, work that does not use one's talents";
    static final String TAURUS = "Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
            "Weaknesses: Stubborn, possessive, uncompromising\n" +
            "Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands\n" +
            "Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics";
    static final String GEMINI = "Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\n" +
            "Weaknesses: Nervous, inconsistent, indecisive\n" +
            "Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town\n" +
            "Gemini dislikes: Being alone, being confined, repetition and routine";
    static final String CANCER = "Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\n" +
            "Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure\n" +
            "Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
            "Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life\n";
    static final String LEO = "Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\n" +
            "Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible\n" +
            "Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends\n" +
            "Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen";
    static final String VIRGO = "Strengths: Loyal, analytical, kind, hardworking, practical\n" +
            "Weaknesses: Shyness, worry, overly critical of self and others, all work and no play\n" +
            "Virgo likes: Animals, healthy food, books, nature, cleanliness\n" +
            "Virgo dislikes: Rudeness, asking for help, taking center stage";
    static final String LIBRA = "Strengths: Cooperative,diplomatic, gracious, fair-minded, social\n" +
            "Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity\n" +
            "Libra likes: Harmony, gentleness, sharing with others, the outdoors\n" +
            "Libra dislikes: Violence, injustice, loudmouths, conformity";
    static final String SCORPIO = "Strengths: Resourceful, brave, passionate, stubborn, a true friend\n" +
            "Weaknesses: Distrusting, jealous, secretive, violent\n" +
            "Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion\n" +
            "Scorpio dislikes: Dishonesty, revealing secrets, passive people";
    static final String SAGITTARIUS = "Strengths: Generous, idealistic, great sense of humor\n" +
            "Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic\n" +
            "Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
            "Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details";
    static final String CAPRICORN = "Strengths: Responsible, disciplined, self-control, good managers\n" +
            "Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst\n" +
            "Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
            "Capricorn dislikes: Almost everything at some point";
    static final String PISCES = "Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\n" +
            "Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
            "Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
            "Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind";


    public static void main(String[] args) {
        BirthDay();

    }

    public static void BirthDay() {

        String userName;
        String astro_sign = "";
        String astroInfo = "";
        String animal = "";
        String element = "";
        String compatibility = "";
        String description = "";


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your first and last name: ");
        userName = scanner.nextLine();

        System.out.println("Please enter in your Year of Birth in YYYY format: ");
        String yearsStr = scanner.nextLine();
        int year = Integer.parseInt(yearsStr);


        System.out.println("Please enter in your Month of Birth in MM format: ");
        String monthStr = scanner.nextLine();
        int month = Integer.parseInt(monthStr);


        System.out.println("Please enter in your Day of Birth in DD format: ");
        String dayStr = scanner.nextLine();
        int day = Integer.parseInt(dayStr);
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");

        //create calendar object for current day
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);

        Period p = Period.between(birthday, today);

        System.out.println("USER INFO: ");
        System.out.println("Name: " + userName);
        System.out.println(Integer.toString(p.getYears()) + " Years");
        System.out.println(Integer.toString(p.getMonths()) + " Months");
        System.out.println(Integer.toString(p.getDays()) + " Days" + "\n");

        //return year;

        if (month == 12) {

            if (day < 22) {
                astro_sign = "Sagittarius";
                astroInfo = SAGITTARIUS;
            } else {
                astro_sign = "Capricorn";
                astroInfo = CAPRICORN;
            }

        } else if (month == 1) {
            if (day < 20) {
                astro_sign = "Capricorn";
                astroInfo = CAPRICORN;
            } else {
                astro_sign = "Aquarius";
                astroInfo = AQUARIUS;
            }
        } else if (month == 2) {
            if (day < 19) {
                astro_sign = "Aquarius";
                astroInfo = AQUARIUS;
            } else {
                astro_sign = "Pisces";
                astroInfo = PISCES;
            }
        } else if (month == 3) {
            if (day < 21) {
                astro_sign = "Pisces";
                astroInfo = PISCES;
            } else {
                astro_sign = "Aries";
                astroInfo = ARIES;
            }
        } else if (month == 4) {
            if (day < 20) {
                astro_sign = "Aries";
                astroInfo = ARIES;
            } else {
                astro_sign = "Taurus";
                astroInfo = TAURUS;
            }
        } else if (month == 5) {
            if (day < 21) {
                astro_sign = "Taurus";
                astroInfo = TAURUS;
            } else {
                astro_sign = "Gemini";
                astroInfo = GEMINI;
            }
        } else if (month == 6) {
            if (day < 21) {
                astro_sign = "Gemini";
                astroInfo = GEMINI;
            } else {
                astro_sign = "Cancer";
                astroInfo = CANCER;
            }
        } else if (month == 7) {
            if (day < 23) {
                astro_sign = "Cancer";
                astroInfo = CANCER;
            } else {
                astro_sign = "Leo";
                astroInfo = LEO;
            }
        } else if (month == 8) {
            if (day < 23) {
                astro_sign = "Leo";
                astroInfo = LEO;
            } else{
                astro_sign = "Virgo";
            astroInfo = VIRGO;}
        } else if (month == 9) {
            if (day < 23) {
                astro_sign = "Virgo";
                astroInfo = VIRGO;
            } else{
                astro_sign = "Libra";
            astroInfo = LIBRA;}
        } else if (month == 10) {
            if (day < 23) {
                astro_sign = "Libra";
                astroInfo = LIBRA;
            } else{
                astro_sign = "Scorpio";
            astroInfo = SCORPIO;}
        } else if (month == 11) {
            if (day < 22) {
                astro_sign = "Scorpio";
                astroInfo = SCORPIO;
            } else{
                astro_sign = "Sagittarius";
            astroInfo = SAGITTARIUS;}
        }

        System.out.println("ASTROLOGY INFO");
        System.out.println("Sign: " + astro_sign);
        System.out.println("Info: " + astroInfo + "\n");

        int remainder = year % 12;

        // determine which animal it is
        switch (remainder) {
            case (0):
                animal = "Monkey";
                element = "Metal";
                compatibility = "Rat or Dragon";
                description = "Monkeys are energetic, upbeat, and good at listening but lack self-control";
                break;
            case (1):
                animal = "Rooster";
                element = "Metal";
                compatibility = "Ox, Dragon or Snake";
                description = "Roosters are practical, resourceful, observant, analytical, straightforward, trusting, honest, perfectionists, neat and conservative";
                break;
            case (2):
                animal = "Dog";
                element = "Earth";
                compatibility = "Tiger, Rabbit";
                description = "Dog are loyal, faithful, honest, distrustful, often guilty of telling white lies, temperamental, prone to mood swings, dogmatic, and sensitive";
                break;
            case (3):
                animal = "Pig";
                element = "Water";
                compatibility = "Goat or Rabbit";
                description = "Pigs are extremely nice, good-mannered and tasteful";
                break;
            case (4):
                animal = "Rat";
                element = "Water";
                compatibility = "Dragon, Rabbit or Ox";
                description = "Rats are quick-witted, resourceful, versatile, kind, smart, and lovely";
                break;
            case (5):
                animal = "Ox";
                element = "Earth";
                compatibility = "Rat, Snake or Rooster";
                description = "Ox is steadfast, solid, a goal-oriented leader, detail-oriented, hard-working, stubborn, serious and introverted";
                break;
            case (6):
                animal = "Tiger";
                element = "Wood";
                compatibility = "Horse or Dog";
                description = "Tigers are authoritative, self-possessed, have strong leadership qualities, are charming, ambitious, courageous, warm-hearted";
                break;
            case (7):
                animal = "Rabbit";
                element = "Wood";
                compatibility = "Goat, Dog, Rat, or Pig";
                description = "Rabbits are popular, compassionate, sincere, and they like to avoid conflict";
                break;
            case (8):
                animal = "Dragon";
                element = "Earth";
                compatibility = "Rat, Monkey or Rooster";
                description = "Dragons are energetic and warm-hearted, charismatic, lucky at love and egotistic";
                break;
            case (9):
                animal = "Snake";
                element = "Fire";
                compatibility = "Ox or Rooster";
                description = "Snakes are seductive, gregarious, introverted, generous, charming, good with money, analytical, insecure, jealous, slightly dangerous, smart";
                break;
            case (10):
                animal = "Horse";
                element = "Fire";
                compatibility = "Tiger, Goat or Dog";
                description = "They’re energetic, self-reliant, money-wise, and they enjoy traveling, love and intimacy";
                break;
            case (11):
                animal = "Ram";
                element = "Earth";
                compatibility = "Rabbit, Horse or Pig";
                description = "Rams are creative, thinkers, wanderers, unorganized, high-strung and insecure, and can be anxiety-ridden";
                break;
        }
        // depending on the year in the cycle, print out the animal
        System.out.println("CHINESE ZODIAC");
        System.out.println("Chinese Zodiac sign: " + animal);
        System.out.println("Chinese Zodiac info: Element: " + element);
        System.out.println("Partners well with: " + compatibility);
        System.out.println("Characteristics: " + description);

        //return year;
    }
}


