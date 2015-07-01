# Write a method that takes in an integer (greater than one) and
# returns true if it is prime; otherwise return false.
#
# You may want to use the `%` modulo operation. `5 % 2` returns the
# remainder when dividing 5 by 2; therefore, `5 % 2 == 1`. In the case
# of `6 % 2`, since 2 evenly divides 6 with no remainder, `6 % 2 == 0`.
# More generally, if `m` and `n` are integers, `m % n == 0` if and only
# if `n` divides `m` evenly.
#
# You would not be expected to already know about modulo for the
# challenge.
#
# Difficulty: medium.

def is_prime?(number)
	hasFactor = (number != 2 && number % 2 == 0) || (number != 3 && number % 3 == 0)|| (number !=5 && number % 5 == 0) || (number !=7 && number % 7 == 0)
	return false if number <= 1 || hasFactor	# ???? is hasFactor evaluated when it is defined (above) or when it is called (left)?
	return true									# if it's when defined, break this if condition to test for neg number first
end
'''
	possibleFactors = [2, 3, 5, 7]				#ALTERNATE APPROACH
	possibleFactors.each do |factor|
		unless number == factor
			if number % factor == 0 || number <= 1
				return false
			end
		end
	end
	return true
end
'''
'''
	return false if number <=1					# separating this from the if condition ensures loop won\'t be evaluated needlessly
	possibleFactors = [2, 3, 5, 7]				#ALTERNATE APPROACH
	possibleFactors.each do |factor|
		unless number == factor
			if number % factor == 0 
				return false
			end
		end
	end
	return true
end
'''



# These are tests to check that your code is working. After writing
# your solution, they should all print true.

puts('is_prime?(2) == true: ' + (is_prime?(2) == true).to_s)
puts('is_prime?(3) == true: ' + (is_prime?(3) == true).to_s)
puts('is_prime?(4) == false: ' + (is_prime?(4) == false).to_s)
puts('is_prime?(9) == false: ' + (is_prime?(9) == false).to_s)
puts('is_prime?(-7) == false: ' + (is_prime?(-7) == false).to_s)


=begin 
#APP ACADEMY SOLN

def is_prime?(number)
  if number <= 1
    # only numbers > 1 can be prime.
    return false
  end

  idx = 2
  while idx < number
    if (number % idx) == 0
      return false
    end

    idx += 1
  end

  return true
end
=end

