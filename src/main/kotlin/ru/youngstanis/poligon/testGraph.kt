package ru.youngstanis.poligon

fun main() {
    testGraphProtoSort()
}

fun testGraphProtoSort() {
    val graphProto1 = GraphProto(
        1,
        GraphType.CPU_LA_BY_CORE,
        arrayListOf(
            Line(
                56,
                "Smth 5"
            )
        )
    )
    val graphProto2 = GraphProto(
        2,
        GraphType.CPU_LA_ALL_CORES,
        arrayListOf(
            Line(
                75,
                "CPU LA 1 Min"),
            Line(
                42,
                "CPU LA 4 Sec")
            // GraphLine(
            //     15,
            //     "CPU LA 45 Min"),
        )
    )
    val graphProto3 = GraphProto(
        3,
        GraphType.CPU_LA_ALL_CORES,
        arrayListOf()
    )
    val graphProtoArr = listOf(graphProto1, graphProto2, graphProto3)
    println(graphProtoArr)

    for(graphProto in graphProtoArr) {
        if (graphProto.type == GraphType.CPU_LA_ALL_CORES) {
            val timeMap = mapOf(
                "Ms" to 1,
                "Sec" to 1000,
                "Min" to 60000,
                "Hr" to 3600000
            )

            // val sortedLines = graphProto.lines.sortedBy {
            //     graphProto.lines.maxByOrNull { line ->
            //         val parts = line.name.split(" ")
            //         val timeIndex = timeMap.getOrDefault(parts[parts.size - 1], 1)
            //         val timeValue = parts[parts.size - 2].toInt()
            //         timeIndex * timeValue
            //     }?.name?.substringAfter(" ")
            // }

            val sortedLines = graphProto.lines.sortedWith{ line1, line2 ->
                val partsLine1 = line1.name.split(" ")
                val partsLine2 = line2.name.split(" ")
                partsLine1[partsLine1.size - 2].toInt() * timeMap.getOrDefault(partsLine1[partsLine1.size - 1], 1)
                    .compareTo(partsLine2[partsLine2.size - 2].toInt() * timeMap.getOrDefault(partsLine2[partsLine2.size - 1], 1))
            }

            println(sortedLines)
            graphProto.lines.clear()
            graphProto.lines.addAll(sortedLines)
        }
    }
    println(graphProtoArr)
}

enum class GraphType {
    CPU_LA_ALL_CORES, CPU_LA_BY_CORE
}

class Line(
    val lineId: Long,
    val name: String
) {
    override fun toString(): String {
        return "{ lineId : $lineId, name : $name }"
    }
}

class GraphProto(
    val graphId: Long,
    val type: GraphType,
    val lines: ArrayList<Line>
) {
    override fun toString(): String {
        return "{ graphId: $graphId, type : $type, lines : $lines }"
    }
}