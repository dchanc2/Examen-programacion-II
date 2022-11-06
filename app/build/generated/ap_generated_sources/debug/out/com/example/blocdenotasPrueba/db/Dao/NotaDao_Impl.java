package com.example.blocdenotasPrueba.db.Dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.blocdenotasPrueba.db.Entinty.NotaEntinty;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NotaDao_Impl implements NotaDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NotaEntinty> __insertionAdapterOfNotaEntinty;

  private final EntityDeletionOrUpdateAdapter<NotaEntinty> __updateAdapterOfNotaEntinty;

  private final SharedSQLiteStatement __preparedStmtOfDeleteALL;

  private final SharedSQLiteStatement __preparedStmtOfDeleteId;

  public NotaDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNotaEntinty = new EntityInsertionAdapter<NotaEntinty>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `notas` (`id`,`titulo`,`contenido`,`favorita`,`color`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NotaEntinty value) {
        stmt.bindLong(1, value.id);
        if (value.titulo == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.titulo);
        }
        if (value.contenido == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.contenido);
        }
        final int _tmp = value.favorita ? 1 : 0;
        stmt.bindLong(4, _tmp);
        if (value.color == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.color);
        }
      }
    };
    this.__updateAdapterOfNotaEntinty = new EntityDeletionOrUpdateAdapter<NotaEntinty>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `notas` SET `id` = ?,`titulo` = ?,`contenido` = ?,`favorita` = ?,`color` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NotaEntinty value) {
        stmt.bindLong(1, value.id);
        if (value.titulo == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.titulo);
        }
        if (value.contenido == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.contenido);
        }
        final int _tmp = value.favorita ? 1 : 0;
        stmt.bindLong(4, _tmp);
        if (value.color == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.color);
        }
        stmt.bindLong(6, value.id);
      }
    };
    this.__preparedStmtOfDeleteALL = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM notas";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM notas WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final NotaEntinty nota) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNotaEntinty.insert(nota);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final NotaEntinty nota) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfNotaEntinty.handle(nota);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteALL() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteALL.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteALL.release(_stmt);
    }
  }

  @Override
  public void deleteId(final int idNota) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, idNota);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteId.release(_stmt);
    }
  }

  @Override
  public LiveData<List<NotaEntinty>> getAll() {
    final String _sql = "SELECT * FROM notas ORDER BY titulo ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"notas"}, false, new Callable<List<NotaEntinty>>() {
      @Override
      public List<NotaEntinty> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitulo = CursorUtil.getColumnIndexOrThrow(_cursor, "titulo");
          final int _cursorIndexOfContenido = CursorUtil.getColumnIndexOrThrow(_cursor, "contenido");
          final int _cursorIndexOfFavorita = CursorUtil.getColumnIndexOrThrow(_cursor, "favorita");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final List<NotaEntinty> _result = new ArrayList<NotaEntinty>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NotaEntinty _item;
            final String _tmpTitulo;
            if (_cursor.isNull(_cursorIndexOfTitulo)) {
              _tmpTitulo = null;
            } else {
              _tmpTitulo = _cursor.getString(_cursorIndexOfTitulo);
            }
            final String _tmpContenido;
            if (_cursor.isNull(_cursorIndexOfContenido)) {
              _tmpContenido = null;
            } else {
              _tmpContenido = _cursor.getString(_cursorIndexOfContenido);
            }
            final boolean _tmpFavorita;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfFavorita);
            _tmpFavorita = _tmp != 0;
            final String _tmpColor;
            if (_cursor.isNull(_cursorIndexOfColor)) {
              _tmpColor = null;
            } else {
              _tmpColor = _cursor.getString(_cursorIndexOfColor);
            }
            _item = new NotaEntinty(_tmpTitulo,_tmpContenido,_tmpFavorita,_tmpColor);
            _item.id = _cursor.getInt(_cursorIndexOfId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<NotaEntinty>> getALLFavoritas() {
    final String _sql = "SELECT * FROM notas WHERE favorita LIKE 'true'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"notas"}, false, new Callable<List<NotaEntinty>>() {
      @Override
      public List<NotaEntinty> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitulo = CursorUtil.getColumnIndexOrThrow(_cursor, "titulo");
          final int _cursorIndexOfContenido = CursorUtil.getColumnIndexOrThrow(_cursor, "contenido");
          final int _cursorIndexOfFavorita = CursorUtil.getColumnIndexOrThrow(_cursor, "favorita");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final List<NotaEntinty> _result = new ArrayList<NotaEntinty>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NotaEntinty _item;
            final String _tmpTitulo;
            if (_cursor.isNull(_cursorIndexOfTitulo)) {
              _tmpTitulo = null;
            } else {
              _tmpTitulo = _cursor.getString(_cursorIndexOfTitulo);
            }
            final String _tmpContenido;
            if (_cursor.isNull(_cursorIndexOfContenido)) {
              _tmpContenido = null;
            } else {
              _tmpContenido = _cursor.getString(_cursorIndexOfContenido);
            }
            final boolean _tmpFavorita;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfFavorita);
            _tmpFavorita = _tmp != 0;
            final String _tmpColor;
            if (_cursor.isNull(_cursorIndexOfColor)) {
              _tmpColor = null;
            } else {
              _tmpColor = _cursor.getString(_cursorIndexOfColor);
            }
            _item = new NotaEntinty(_tmpTitulo,_tmpContenido,_tmpFavorita,_tmpColor);
            _item.id = _cursor.getInt(_cursorIndexOfId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
