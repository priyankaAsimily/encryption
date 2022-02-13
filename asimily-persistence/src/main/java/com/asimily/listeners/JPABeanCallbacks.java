package com.asimily.listeners;

import org.eclipse.persistence.descriptors.DescriptorEvent;
import org.eclipse.persistence.descriptors.DescriptorEventAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.asimily.models.EBase;

public class JPABeanCallbacks extends DescriptorEventAdapter {

  private static final Logger logger = LoggerFactory.getLogger(JPABeanCallbacks.class);

  public void postMerge(DescriptorEvent event) {
    //event.getSession();
    if (event.getObject() instanceof EBase && event.getOriginalObject() instanceof EBase) {
      EBase orig = (EBase) event.getObject();
      EBase modified = (EBase) event.getOriginalObject();
      orig.setPktTime(modified.getPktTime());
    }
    /*event.setOriginalObject(orig);*/
  }
//
//	@PrePersist
//	void onPrePersist(Object o) {
//		try {
//			if (o != null && o instanceof MBase) {
//				MBase entity = (MBase) o;
//				if (entity.getGlobalId() == null
//						|| entity.getGlobalId().length() == 0) {
//					entity.setGlobalId(GUIDUtil.genGUI());
//				}
//
//				entity.setUpdateTime(DateUtil.getUTCDate());
//				entity.setVersionNumber(0);
//
//				if (o instanceof MModerationBase) {
//					MModerationBase moderationObj = (MModerationBase) o;
//					AKASecurityContext context = AKAContextHolder
//							.getSecurityContext();
//					if (context != null) {
//						UserSessionBase userSession = context.getUserSession();
//						if (userSession != null) {
//							moderationObj.setAddedByUserId(userSession
//									.getUserId());
//							moderationObj.setAddedByUserName(userSession
//									.getUserName());
//							moderationObj.setUpdatedByUserId(userSession
//									.getUserId());
//							moderationObj.setUpdatedByUserName(userSession
//									.getUserName());
//						}
//					} else {
//						if (logger.isDebugEnabled()) {
//							logger.debug(
//									"Security context not found for this request. obj="
//											+ o, new Throwable());
//						}
//					}
//				}
//			}
//		} catch (Throwable t) {
//			logger.error(t);
//		}
//
//	}
//
//	// @PostPersist
//	// void onPostPersist(Object o) {
//	// if (o != null && o instanceof MBase) {
//	// MBase entity = (MBase) o;
//	// if (logger.isDebugEnabled()) {
//	// logger.debug("DBChange.create:class=" + o.getClass().getName()
//	// + entity.getId());
//	// }
//	//
//	// }
//	// }
//
//	// @PostLoad void onPostLoad(Object o) {}
//
//	@PreUpdate
//	void onPreUpdate(Object o) {
//		try {
//			if (o != null && o instanceof MBase) {
//				MBase entity = (MBase) o;
//				entity.setLuTime(null);
//				if (entity.isMakeVersionCopy()) {
//					entity.setVersionNumber(entity.getVersionNumber() + 1);
//				}
//
//				if (o instanceof MModerationBase) {
//					MModerationBase moderationObj = (MModerationBase) o;
//					if (moderationObj.isMakeVersionCopy()
//							&& !moderationObj.isMerging()) {
//						entity.setUpdateTime(DateUtil.getUTCDate());
//						AKASecurityContext context = AKAContextHolder
//								.getSecurityContext();
//						if (context != null) {
//							UserSessionBase userSession = context
//									.getUserSession();
//							if (userSession != null) {
//								moderationObj.setUpdatedByUserId(userSession
//										.getUserId());
//								moderationObj.setUpdatedByUserName(userSession
//										.getUserName());
//							}
//						}
//					}
//					// Unset it so that if this same object is getting updated
//					// again, then we can make copy of it
//					moderationObj.setMerging(false);
//					moderationObj.setMerged(true);
//				} else {
//					entity.setUpdateTime(DateUtil.getUTCDate());
//				}
//			}
//		} catch (Throwable t) {
//			logger.error(t);
//		}
//
//	}
//
//	// @PostUpdate
//	// void onPostUpdate(Object o) {
//	// }
//
//	// @PreRemove void onPreRemove(Object o) {}
//
//	// @PostRemove
//	// void onPostRemove(Object o) {
//	// }

}
