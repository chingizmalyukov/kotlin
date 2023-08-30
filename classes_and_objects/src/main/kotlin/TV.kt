class TV (brandArg: String = "noBrand", modelArg: String, diagonalSizeArg : Double ){
    private var brand = brandArg
    private var model = modelArg
    private var diagonalSize = diagonalSizeArg
    private var power = false
    private var currentVolume = 0
    private var currentChannel : Pair<Int, String?> = (1 to "NoChannel")
    private var tvStatusMap = mapOf(
        false to "\nTV turned off",
        true to "\nTV turned on"
    )
    private var channelsMap = mutableMapOf(1 to "Channels not configure")
    init {
        println("\nTV created")
        printInfo()
        changePower()
        channelsConfig()
        changePower()
    }
    fun changePower(){
        power = !power
        println(tvStatusMap[power])
    }
    fun channelsConfig(){
        println("Starting channels config")
        val channelsList = Channels.getRandomChannels()
        for (number in 1..channelsList.size){
            channelsMap[number] = channelsList[number-1]
        }
        println("Channel setup completed")
        println("New channels list:")
        for (entries in channelsMap.entries) {
            println("${entries.key} — ${entries.value}")
        }
    }
    fun volumeChangeUp(){
        if(!power){return}
        val resultVolume = currentVolume + 1
        currentVolume = if (resultVolume > MAX_VOLUME){
            100
        } else{resultVolume}
        println("Volume $currentVolume/$MAX_VOLUME")
    }
    fun volumeChangeDown(){
        if(!power){return}
        val resultVolume = currentVolume - 1
        currentVolume = if (resultVolume < 0){0}
        else{resultVolume}
        println("Volume $currentVolume/$MAX_VOLUME")
    }
    fun changeChannel(channelNumber : Int){
        if (!power){
            changePower()
        }
        if (channelNumber in channelsMap) {
            val newChannel: Pair<Int, String?> = (channelNumber to channelsMap[channelNumber])
            currentChannel = newChannel
            println("Chanel changed to $currentChannel")
        }
        else{
            println("Channel not found")
        }
    }
    fun changeChannelUp(){
        if (!power){
            changePower()
        }
        val resultIndex = currentChannel.first + 1
        if (resultIndex > channelsMap.size){
            currentChannel = 1 to channelsMap[1]
            println("Chanel changed to $currentChannel")}
        else{
            currentChannel = resultIndex to channelsMap[resultIndex]
            println("Chanel changed to $currentChannel")}
    }
    fun changeChannelDown(){
        if (!power){
            changePower()
        }
        val resultIndex = currentChannel.first - 1
        if (resultIndex < 1){
            currentChannel = channelsMap.size to channelsMap[channelsMap.size]
            println("Chanel changed to $currentChannel")}
        else{
            currentChannel = resultIndex to channelsMap[resultIndex]
            println("Chanel changed to $currentChannel")}
    }
    fun printInfo() {
        println("***TV info***")
        println("brand: $brand, model: $model diagonalSize : $diagonalSize")
        println("Channels list:")
        for (entries in channelsMap.entries) {
            println("${entries.key} — ${entries.value}")
        }
    }
    companion object{
        const val MAX_VOLUME = 100
    }
}