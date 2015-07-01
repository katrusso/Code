# Write a method that returns the `n`th prime number. Recall that only
# numbers greater than 1 can be prime.
#
# Difficulty: medium.

# You may use our `is_prime?` solution.


'''NOTES:
Check the dictionary to see if the number has already been calculated. 
If so, return it (would be helpful to make "infinite loop" so values aren\'t recalculated each time input is checked)
Otherwise, while the length of the nthPrime container is less than the nth number, calculate the primes starting from the max value stored

could also create a module in document: 15pp_isPrime, import it, and use its "is_prime?()" method (identical)
'''

def is_prime?(number)
  return false if number <=1
  i = 2
  while i<number
    hasFactor = number % i == 0
    return false if hasFactor 
    i += 1
  end
  return true                 
end


def nth_prime(number)
  nthPrimeContainer = Hash.new()  
  counter = nthPrimeContainer[nthPrimeContainer.length] || 2

  while nthPrimeContainer.length <= number
      nthPrimeContainer[nthPrimeContainer.length + 1] = counter if is_prime?(counter)
      counter += 1
  end
  #puts nthPrimeContainer
  return nthPrimeContainer[number] if nthPrimeContainer[number]
end

# These are tests to check that your code is working. After writing
# your solution, they should all print true.

puts('nth_prime(1) == 2: ' + (nth_prime(1) == 2).to_s)
puts('nth_prime(2) == 3: ' + (nth_prime(2) == 3).to_s)
puts('nth_prime(3) == 5: ' + (nth_prime(3) == 5).to_s)
puts('nth_prime(4) == 7: ' + (nth_prime(4) == 7).to_s)
puts('nth_prime(5) == 11: ' + (nth_prime(5) == 11).to_s)
puts('nth_prime(53) == 241: ' + (nth_prime(53) == 241).to_s)
puts('nth_prime(187) == 1117: ' + (nth_prime(187) == 1117).to_s)


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

def nth_prime(n)
  prime_num = 0

  i = 2
  while true
    if is_prime?(i)
      prime_num += 1
      if prime_num == n
        return i
      end
    end

    i += 1
  end
end

=end