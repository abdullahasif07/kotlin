class Scores(
    var current: Double = 0.0,
    var best: Double = 0.0
) {
    fun updateScore(): Double {
        if (this.best < this.current) {
            return this.current
        } else {
            return this.best
        }
    }
}

class Player(
 	val name: String,
    val surname: String,
    var totalScore: Double = 0.0,
	var personalBestScore: Double = 0.0
) {
    fun fullName():String
    {
        return (this.name +" "+this.surname) 
    }
}

fun main() {
    val P1 = Player("Nicola", "Tesla")
	val P2 = Player("Thomas", "Edison")
    var lvlscore: Double=0.0
    
    lvlscore = 20.0
    val scoring= Scores(lvlscore,P1.personalBestScore)
    P1.personalBestScore=scoring.updateScore()
    P1.totalScore+=lvlscore;
    
    lvlscore = 35.0
    val scoring2= Scores(lvlscore,P1.personalBestScore)
    P1.personalBestScore=scoring2.updateScore()
    P1.totalScore+=lvlscore
    
    
    
    
    lvlscore = 25.0
    val scoring3= Scores(lvlscore,P1.personalBestScore)
    P1.personalBestScore=scoring3.updateScore()
    P1.totalScore+=lvlscore
    
	println("Winner ${P1.fullName()} with a total score of ${P1.totalScore} and personal best ${P1.personalBestScore}")
}