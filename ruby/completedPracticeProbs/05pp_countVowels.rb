# Write a method that takes a string and returns the number of vowels
# in the string. You may assume that all the letters are lower cased.
# You can treat "y" as a consonant.
#
# Difficulty: easy.

def count_vowels(string)
  vowels = {'a' => 0, 'e' => 0, 'i' => 0, 'o' => 0, 'u' => 0, 'count' => 0}
	
  string.each_char do |i|
	vowels['count'] += 1 if vowels[i]
  end
  return vowels['count']
end


# These are tests to check that your code is working. After writing
# your solution, they should all print true.

puts('count_vowels("abcd") == 1: ' + (count_vowels('abcd') == 1).to_s)
puts('count_vowels("color") == 2: ' + (count_vowels('color') == 2).to_s)
puts('count_vowels("colour") == 3: ' + (count_vowels('colour') == 3).to_s)
puts('count_vowels("cecilia") == 4: ' + (count_vowels('cecilia') == 4).to_s)

=begin
#APP ACADEMY SOLN
---------------------------------
def count_vowels(string)
  num_vowels = 0

  i = 0
  while i < string.length
    if (string[i] == "a" || string[i] == "e" || string[i] == "i" || string[i] == "o" || string[i] == "u")
      num_vowels += 1
    end

    i += 1
  end

  return num_vowels
end
---------------------------------
=end



=begin 
#MY ORIGINAL SOLN 
---------------------------------
def count_vowels(string)
	v_count = 0
	i=0
	while i<string.length
		if string[i] == "a" || string[i] == "e" || string[i] == "i" || string[i] == "o" || string[i] == "u"
			v_count += 1
		end
		i +=1
	end
	return v_count
end
---------------------------------




#ALTERNATE SOLN
---------------------------------
def count_vowels(string)
	v_count = 0
	vowels = {"a" => 0, "e" => 0, "i" => 0, "o" => 0, "u" => 0}
	string = string.split("")
	string.each do |i|
		v_count += 1 if vowels[i]
	end
	return v_count
end
---------------------------------
=end