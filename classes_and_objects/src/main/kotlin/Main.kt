fun main(){
    val toshiba = TV("Toshiba", "r34", 17.0)
    val sony = TV("Sony", "rondo", 13.2)
    val hp = TV("HP", "22es", 21.5)

    for (count in 0..2){toshiba.changeChannelUp()}
    println()
    for (count in 0..2){toshiba.changeChannelDown()}

    sony.changePower()
    for (count in 0..3){sony.volumeChangeUp()}
    println()
    for (count in 0..4){sony.volumeChangeDown()}

    hp.changeChannel(9)
    hp.changeChannel(2)


}