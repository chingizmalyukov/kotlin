object Channels {

    private var channelsList = listOf(
        "channel one",
        "channel two",)
    fun getRandomChannels(): List<String>{
        return channelsList.shuffled()
    }
}