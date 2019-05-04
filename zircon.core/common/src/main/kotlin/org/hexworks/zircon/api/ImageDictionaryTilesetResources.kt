package org.hexworks.zircon.api

import org.hexworks.zircon.internal.resource.ImageDictionaryTilesetResource
import org.hexworks.zircon.api.resource.TilesetResource
import org.hexworks.zircon.internal.resource.TilesetSourceType
import kotlin.jvm.JvmStatic

/**
 * This object can be used to load either built-in Image Dictionary
 * [TilesetResource]s or external ones.
 */
object ImageDictionaryTilesetResources {

    /**
     * Use this function if you want to load a [TilesetResource]
     * from the filesystem.
     */
    @JvmStatic
    fun loadTilesetFromFilesystem(
            path: String): TilesetResource {
        return ImageDictionaryTilesetResource(
                path = path,
                tilesetSourceType = TilesetSourceType.FILESYSTEM)
    }

}
