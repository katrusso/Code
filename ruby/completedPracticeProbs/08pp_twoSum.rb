# Write a method that takes an array of numbers. If a pair of numbers
# in the array sums to zero, return the positions of those two numbers.
# If no pair of numbers sums to zero, return `nil`.
#
# Difficulty: medium.

def two_sum(nums)
  i = 0
  j = i + 1

  while i < nums.length-1
    while j <nums.length
      return [i, j] if nums[i] + nums[j] == 0
      j += 1
    end
    i += 1
    j = i + 1
  end
  return nil
end


# These are tests to check that your code is working. After writing
# your solution, they should all print true.

puts(
  'two_sum([1, 3, 5, -3]) == [1, 3]: ' + (two_sum([1, 3, 5, -3]) == [1, 3]).to_s
)
puts(
  'two_sum([1, 3, 5]) == nil: ' + (two_sum([1, 3, 5]) == nil).to_s
)

=begin 
#APP ACADEMY SOLN
---------------------------------
def two_sum(nums)
  idx1 = 0
  while idx1 < nums.length
    idx2 = idx1 + 1
    while idx2 < nums.length
      if nums[idx1] + nums[idx2] == 0
        return [idx1, idx2]
      end

      idx2 += 1
    end

    idx1 += 1
  end

  return nil
end
---------------------------------
=end



=begin 
#A (FAILED) ATTEMPT USING HASHMAPS                #:8:in `[]=': can't add a new key into hash during iteration (RuntimeError)
---------------------------------
def two_sum(nums)
  numbers = Hash.new{|hash, key| hash[key] = []}

    i = 0
    while i < nums.length
      numbers[nums[i]]<< i
      i += 1
    end

    numbers.each do |hash, key|
      value = numbers[hash.to_i * -1]
      puts "[#{key}, #{value}]" if value != nil      
    end
end
---------------------------------
=end