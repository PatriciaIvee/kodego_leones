package notes

import mu.KotlinLogging
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet
import kotlin.collections.LinkedHashMap
import kotlin.collections.LinkedHashSet

private val logger = KotlinLogging.logger{}
fun main() {
    var listNames = ArrayList<String>()
    var listLocations = LinkedList<String>()

    var mapName = HashMap<String, String>()
    var mapLocation = LinkedHashMap<String, String>()

    var setName = HashSet<String>()
    var setLocation = LinkedHashSet<String>()

    var set:Set<String> = HashSet<String>()
    var map:Map<String, String> = HashMap<String, String>()
    var list:List<String> = ArrayList<String>()

    var names:List<String> = mutableListOf<String>("Jason", "Kurt", "Logan", "Monique")
    var numbers:Set<Char> = mutableSetOf('1', '2', '3', '4', '5')
    var characters:Map<String, Int> = mutableMapOf (("One" to 1), ("Two" to 2), ("Three" to 3))
    var locations:List<String> = listOf("Cubao", "Santolan", "Shaw", "Boni", "Buendia")
    var arrayList: ArrayList<String> = names as ArrayList<String>


    for (name in names) {
        logger.info {"Name: $name"}

        }

        for (index in names.indices) {
            logger.info {"Name [$index]: ${names[index]}"}
        }

        var iterator = names.iterator()
        while (iterator.hasNext()) {
            logger.info { "Name: ${iterator.next()}"}
        }

        names.forEach {
            logger. info {"Name: $it"}
        }

        names.forEachIndexed { index, name ->
            logger.info {"Name [$index]: $name"}
        }

        var studentNames = names as ArrayList

        studentNames.add("Noah")
        studentNames.add(0, "Isaiah")
        studentNames.add("Oakley")
        studentNames.addAll(listOf("Patrick", "Quentine"))

        var studentCount = studentNames.size
        // to make into alphabetical order use .sort
        for (name in names) {
            logger.info{"Name: $name"}
        }

        studentNames.removeAt(1)
        studentNames.remove("Oakley")
        // remove data

        studentNames[0] = "Edited Entry"

        studentNames.contains("Patrick")

    }