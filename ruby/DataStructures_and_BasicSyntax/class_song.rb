class Song

	def initialize(lyrics)
		@lyrics = lyrics
	end

	def sing_me_a_song()
		@lyrics.each {|line| puts line }
	end
end


happy_bday = Song.new(["Happy birthday to you", "you live in a zoo", "you look like a monkey", "and you smell like one too!"])
happy_bday.sing_me_a_song()
puts nil

mary_little_lamb = Song.new(["mary had a little lamb", "little lamb", "little lamb", "..."])
mary_little_lamb.sing_me_a_song()
puts nil

