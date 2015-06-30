

END {
	puts "ending"
}

BEGIN {
	puts "beginning"
}

def longAssFunctionName
	puts "the function"
end



alias :newfnname :longAssFunctionName 


newfnname

hash = {'x' => 1, 'y' => 3}
puts hash

puts "tester" <=> "test"

puts (0..3).to_a #inclusive == [0, 1, 2, 3]
puts (0...3).to_a #noninclusive == [0, 1, 2]

#$ global scope
input = $stdin.gets.chomp
puts input

other_input = gets.chomp
puts other_input