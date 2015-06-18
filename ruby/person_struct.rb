#!/usr/bin/ruby

Owner = Struct.new(:petsName, :address, :phone) do
	def summary
		puts %/
		Pet's Name: #{petsName}
		Address: #{address}
		Phone: #{phone}
		/
	end
end


Dog = Struct.new(:ownersName, :breed, :color, :favToy) do
	def summary
		puts %/
		Owner's Name: #{ownersName}
		Breed: #{breed}
		Color: #{color}
		Favorite Toy: #{favToy}
		/
	end
end


Owner.new("Tanny", "Albany, NY", "(518) 322-2929").summary
Dog.new("Kat", "Biiiiichon", "white", "Wholly the Lamb").summary
