# Write a method that takes a string in and returns true if the letter
# "z" appears within three letters **after** an "a". You may assume
# that the string contains only lowercase letters.
#
# Difficulty: medium.


def nearby_az(string)
  (0..string.length-1).each do |i|
    return true if string[i+1] == "z" || string[i + 2] == "z" || string[i+3] == "z" unless string[i] != "a"
  end
  return false
end



# These are tests to check that your code is working. After writing
# your solution, they should all print true.

puts('nearby_az("baz") == true: ' + (nearby_az('baz') == true).to_s)
puts('nearby_az("abz") == true: ' + (nearby_az('abz') == true).to_s)
puts('nearby_az("abcz") == true: ' + (nearby_az('abcz') == true).to_s)
puts('nearby_az("a") == false: ' + (nearby_az('a') == false).to_s)
puts('nearby_az("z") == false: ' + (nearby_az('z') == false).to_s)
puts('nearby_az("za") == false: ' + (nearby_az('za') == false).to_s)


=begin
#APP ACADEMY SOLN
---------------------------------
def nearby_az(string)
  idx1 = 0
  while idx1 < string.length
    if string[idx1] != "a"
      idx1 += 1
      next
    end

    idx2 = idx1 + 1
    while (idx2 < string.length) && (idx2 <= idx1 + 3)
      if string[idx2] == "z"
        return true
      end

      idx2 += 1
    end

    idx1 += 1
  end

  return false
end
---------------------------------
=end



=begin 
#MY ORIGINAL SOLN 
---------------------------------
def nearby_az(string)
  i = 0
  while i < string.length
    unless string[i] != "a"
      if string[i+1] == "z" || string[i + 2] == "z" || string[i+3] == "z"
        return true
      end
    end
    i += 1
  end
  return false
end
---------------------------------
=end