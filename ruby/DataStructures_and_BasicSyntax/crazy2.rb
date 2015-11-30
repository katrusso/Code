'''
Write a method that takes a number, max, and returns an array of
the integers that:

  - are less than max, and
  - are divisible by either 3 or 5
  - but are NOT divisible by both 3 and 5.

Return the result in increasing order. 
'''
def crazy_nums(max)
	less_than_max_and_div_by_three_or_five_excl = []
	i = 0
	while i < max 
		divByThree = (i % 3 == 0) || false 
		divByFive = (i % 5 == 0) || false 
		less_than_max_and_div_by_three_or_five_excl.push(i) if !!divByThree ^ !!divByFive
		i += 1
	end
	return less_than_max_and_div_by_three_or_five_excl.to_s
end

puts(
	crazy_nums(3) == [].to_s
	)

puts(
	crazy_nums(10) == [3, 5, 6, 9].to_s
	)

puts(
	crazy_nums(20) == [3, 5, 6, 9, 10, 12, 18].to_s
	)		