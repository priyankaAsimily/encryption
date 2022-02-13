package com.asimily.common;

import com.asimily.models.EBase;
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.internal.sessions.AbstractRecord;
import org.eclipse.persistence.internal.sessions.AbstractSession;
import org.eclipse.persistence.queries.DatabaseQuery;
import org.eclipse.persistence.queries.DeleteObjectQuery;
import org.eclipse.persistence.queries.QueryRedirector;
import org.eclipse.persistence.queries.UpdateObjectQuery;
import org.eclipse.persistence.sessions.Record;
import org.eclipse.persistence.sessions.Session;

public class AsimilySoftDeleteRedirector implements QueryRedirector
{

  @Override
  public Object invokeQuery(DatabaseQuery query, Record arguments, Session session)
  {
    ClassDescriptor descriptor = session.getDescriptor(query.getReferenceClass());
    DeleteObjectQuery deleteObjectQuery = (DeleteObjectQuery) query;
    EBase t = (EBase) deleteObjectQuery.getObject();
    t.setSoftDelete(true);
    UpdateObjectQuery updateObjectQuery = new UpdateObjectQuery(t);
    //descriptor.addDirectQueryKey("status", "STATUS");
    updateObjectQuery.setDescriptor(descriptor);
    deleteObjectQuery.setDescriptor(updateObjectQuery.getDescriptor());
    return updateObjectQuery.execute((AbstractSession) session, (AbstractRecord) arguments);
  }

}
