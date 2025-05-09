package anajhn13.com.github.lista_de_compras.data

import anajhn13.com.github.lista_de_compras.model.ItemModel
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ItemModel::class], version = 1)
abstract class ItemDatabase : RoomDatabase() {

    abstract fun itemDao(): ItemDao
}