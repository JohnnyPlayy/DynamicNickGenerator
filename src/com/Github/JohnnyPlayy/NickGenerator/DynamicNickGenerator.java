package com.Github.JohnnyPlayy.NickGenerator;

import java.util.Random;

import com.Github.JohnnyPlayy.NickGenerator.Gender.Gender;
import com.Github.JohnnyPlayy.NickGenerator.Gender.GenderPrefixes;
import com.Github.JohnnyPlayy.NickGenerator.Gender.GenderSuffixes;
import com.Github.JohnnyPlayy.NickGenerator.Language.LanguageType;
import com.Github.JohnnyPlayy.NickGenerator.Options.CaseOption;

public class DynamicNickGenerator {

	public static String generateRandomName(CaseOption.Option caseOption, LanguageType.Language language, String customCharacters, Gender gender) {

		Random random = new Random();

		StringBuilder name = new StringBuilder();

		String[] maleSuffixes = GenderSuffixes.getMaleSuffixes(language);
		String[] femaleSuffixes = GenderSuffixes.getFemaleSuffixes(language);
		String[] unisexSuffixes = GenderSuffixes.getUnisexSuffixes(language);

		String[] malePrefixes = GenderPrefixes.getMalePrefixes(language);
		String[] femalePrefixes = GenderPrefixes.getFemalePrefixes(language);
		String[] unisexPrefixes = GenderPrefixes.getUnisexPrefixes(language);

		String prefix = "";

		switch (gender) {

		case MALE:

			prefix = malePrefixes[random.nextInt(malePrefixes.length)];
			break;

		case FEMALE:

			prefix = femalePrefixes[random.nextInt(femalePrefixes.length)];
			break;

		case UNISEX:

			prefix = unisexPrefixes[random.nextInt(unisexPrefixes.length)];
			break;
		}

		name.append(prefix);
		
        if (customCharacters != null && !customCharacters.isEmpty()) {
        	
            name.append(customCharacters);
        }

		String suffix = "";

		switch (gender) {

		case MALE:

			suffix = maleSuffixes[random.nextInt(maleSuffixes.length)];
			break;

		case FEMALE:

			suffix = femaleSuffixes[random.nextInt(femaleSuffixes.length)];
			break;

		case UNISEX:

			suffix = unisexSuffixes[random.nextInt(unisexSuffixes.length)];
			break;
		}

		name.append(suffix);

		switch (caseOption) {

		case UPPERCASE:

			return name.toString().toUpperCase();

		case LOWERCASE:

			return name.toString().toLowerCase();

		case DEFAULT:

            return capitalize(prefix) + (customCharacters != null ? customCharacters : "") + capitalize(suffix);

		case RANDOM:

			StringBuilder randomizedName = new StringBuilder();

			for (char c : name.toString().toCharArray()) {

				randomizedName.append(random.nextBoolean() ? Character.toUpperCase(c) : Character.toLowerCase(c));
			}

			return randomizedName.toString();

		default:

			return name.toString();
		}
	}
	
    private static String capitalize(String input) {
    	
        if (input == null || input.isEmpty()) {
        	
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }
}